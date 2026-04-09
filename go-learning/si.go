package main

import "fmt"

func main() {
	var p, r, t float64

	fmt.Print("Enter Principal Rate Time: ")
	fmt.Scan(&p, &r, &t)

	si := (p * r * t) / 100

	fmt.Println("Simple Interest:", si)
}
