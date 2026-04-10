package main

import "fmt"

func main() {
	var n int
	fmt.Println("Enter the range to print in reverse:")
	fmt.Scan(&n)
	for i := n; i >= 1; i-- {
		fmt.Print(i, " ")
	}
}
