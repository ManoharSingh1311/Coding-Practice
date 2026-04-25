# Parking Lot System - Low Level Design Notes

## 1) Problem Statement
Design a parking lot system that can:
- Park different vehicle types (`BIKE`, `CAR`, `TRUCK`)
- Find a suitable available spot
- Generate a parking ticket at entry
- Unpark vehicle at exit
- Calculate parking fee based on duration

The goal is to model this in clean object-oriented design, where each class has a clear responsibility.

---

## 2) Core Requirements We Considered
- Multiple floors in the parking lot
- Multiple parking spots per floor
- A spot supports one fixed vehicle type
- A vehicle can be parked only in matching spot type
- Ticket stores entry and exit timestamps
- Fee is computed after exit with a minimum charge

---

## 3) Object Identification (What entities we created and why)

### `Vehicle`
- Represents a real incoming vehicle.
- Fields:
  - `number`: unique plate number
  - `type`: `VehicleType`
- Why needed:
  - Keeps vehicle data separate from parking slot and ticket logic.

### `VehicleType` (Enum)
- Defines supported categories:
  - `BIKE`, `CAR`, `TRUCK`
- Why needed:
  - Prevents string-based bugs and centralizes allowed vehicle categories.

### `ParkingSpot`
- Represents one physical parking spot.
- Fields:
  - `id`
  - `type` (supported vehicle type)
  - `isOccupied`
  - `vehicle` (currently parked)
- Behavior:
  - `canFitVehicle(v)` checks availability + type compatibility
  - `parkVehicle(v)` marks spot occupied
  - `removeVehicle()` frees the spot
- Why needed:
  - Encapsulates spot state and spot-level rules.

### `Floor`
- Groups parking spots by level.
- Fields:
  - `floorNumber`
  - `spots`
- Behavior:
  - `findAvailableSpot(v)` does linear search for a suitable spot
- Why needed:
  - Keeps floor-level traversal logic separate from full-lot orchestration.

### `Ticket`
- Represents one parking session.
- Fields:
  - `ticketId`
  - `vehicle`
  - `spot`
  - `entryTime`
  - `exitTime`
- Behavior:
  - Sets `entryTime` at creation
  - `closeTicket()` sets exit time
- Why needed:
  - Links vehicle + spot + timeline for billing and traceability.

### `ParkingLot`
- Main orchestrator of parking/unparking.
- Fields:
  - `floors`
- Behavior:
  - `parkVehicle(v)`:
    1. Scan floors
    2. Ask each floor for available compatible spot
    3. Park vehicle
    4. Generate ticket (`UUID`)
  - `unparkVehicle(ticket)`:
    1. Release spot
    2. Close ticket (set exit time)
- Why needed:
  - Central application service that coordinates other domain objects.

### `Payment`
- Billing service for ticket duration.
- Behavior:
  - `calculateFee(ticket)`:
    - computes `(exitTime - entryTime)` in hours
    - applies minimum 1-hour charge
    - rate = `20` per hour
- Why needed:
  - Separates billing logic from parking flow and keeps design extendable.

### `Main`
- Demo runner to verify end-to-end flow:
  - build floors/spots
  - create vehicles
  - park, unpark, calculate fee, print output

---

## 4) Step-by-Step LLD Thinking Process

1. **Identify real-world nouns**
   - Vehicle, spot, floor, ticket, lot, payment.
2. **Convert nouns into classes**
   - Each noun becomes a class with minimum required state.
3. **Define ownership and composition**
   - `ParkingLot` has many `Floor`
   - `Floor` has many `ParkingSpot`
   - `Ticket` references `Vehicle` + `ParkingSpot`
4. **Define behavior at the lowest responsible level**
   - Spot-level checks in `ParkingSpot`
   - Floor-level search in `Floor`
   - Lot-level orchestration in `ParkingLot`
   - Billing in `Payment`
5. **Choose simple search strategy first**
   - Linear scan is straightforward and easy to validate.
6. **Add lifecycle timestamps**
   - Entry on ticket creation, exit on unpark.
7. **Compute billing from ticket lifecycle**
   - Decoupled service for easy pricing rule changes later.

---

## 5) How Current Flow Works

1. Create `ParkingLot` with floors and typed spots.
2. On vehicle entry:
   - `ParkingLot.parkVehicle(vehicle)`
   - first compatible free spot is selected
   - ticket is generated and returned
3. On exit:
   - `ParkingLot.unparkVehicle(ticket)`
   - spot becomes free
   - ticket gets exit timestamp
4. Fee:
   - `Payment.calculateFee(ticket)` returns final amount

---

## 6) Design Principles Applied
- **Single Responsibility**:
  - Spot handles occupancy, floor handles search, lot handles coordination, payment handles fees.
- **Encapsulation**:
  - Spot state (`isOccupied`, `vehicle`) is modified only via methods.
- **Extensibility**:
  - New vehicle types and fee policies can be added with minimal changes.
- **Readability first**:
  - Flow is intentionally simple for interview-style LLD and beginner maintainability.

---

## 7) Complexity (Current Approach)
- Park vehicle:
  - Worst-case `O(total_spots)` due to linear scan over floors/spots.
- Unpark vehicle:
  - `O(1)` (directly via ticket -> spot reference).
- Fee calculation:
  - `O(1)`.

---

## 8) Assumptions in This Version
- One spot can hold exactly one vehicle.
- Exact type matching only (e.g., CAR only in CAR spot).
- Ticket is valid and available at exit.
- In-memory model only (no DB or persistence).
- No concurrency handling (single-threaded flow).

---

## 9) Future Enhancements
- Add entry/exit gates and gate assignment strategy.
- Add spot allocation strategy (nearest, random, priority).
- Add reservation support.
- Add vehicle history and audit logs.
- Add multiple pricing policies (weekday/weekend, slab-based, dynamic).
- Add persistence layer and APIs.
- Add thread safety and lock-based spot allocation.

---

This implementation is a clean baseline LLD that correctly models entities, responsibilities, and flow for a parking lot problem while keeping complexity manageable.
