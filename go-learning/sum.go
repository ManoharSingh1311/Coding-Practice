package main

import "fmt"

func main() {

	var a, b int
	fmt.Printf("Enter the two numbers :")
	fmt.Scan(&a, &b)

	sum := a + b

	fmt.Println("Sum:", sum)
}
