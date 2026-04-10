package main

import "fmt"

func main() {
	var num int
	fmt.Println("Enter the number to generate multiplication table :")
	fmt.Scan(&num)

	for i := 1; i <= 10; i++ {
		fmt.Println(num, " x ", i, " = ", num*i)
	}
}
