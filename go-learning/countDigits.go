package main

import "fmt"

func main() {
	var num int
	fmt.Println("Enter the number to count digits in it:")
	fmt.Scan(&num)

	count := 0
	i := num

	for i > 0 {
		i = i / 10
		count++
	}

	fmt.Println("Digits in", num, "are", count)
}
