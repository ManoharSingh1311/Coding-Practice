package main

import "fmt"

func main() {

	var radius float64
	fmt.Println("Enter the radius of circle: ")
	fmt.Scan(&radius)
	const PI = 3.14
	area := PI * radius * radius
	fmt.Println("Area of circle is :", area)
}
