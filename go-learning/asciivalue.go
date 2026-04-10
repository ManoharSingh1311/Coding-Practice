package main

import "fmt"

func main() {
	var n int

	fmt.Print("Enter value of n: ")
	fmt.Scan(&n)

	for i := 1; i <= n; i++ {
		fmt.Printf("%d -> %c\n", i, rune(i))
	}
}
