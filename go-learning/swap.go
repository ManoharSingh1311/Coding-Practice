package main

import "fmt"

func main() {
	var a, b int

	fmt.Println("Enter the two numbers to swap:")
	fmt.Print("A: ")
	fmt.Scan(&a)

	fmt.Print("B: ")
	fmt.Scan(&b)

	temp := a
	a = b
	b = temp
	fmt.Println("Method 1:")
	fmt.Println("After swapping,  numbers are:")
	fmt.Println("A:", a, "B:", b)

	fmt.Println("Method 2:")
	a, b = b, a
	fmt.Println("After again swapping,  numbers are:")
	fmt.Println("A:", a, "B:", b)
}
