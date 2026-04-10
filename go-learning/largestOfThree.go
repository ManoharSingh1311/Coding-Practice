package main

import "fmt"

func main() {
	var a, b, c float32

	fmt.Println("Enter the three numbers")
	fmt.Scan(&a, &b, &c)
	if a >= b && a >= c {
		fmt.Println(a, "is the largest among three")
	} else if b >= a && b >= c {
		fmt.Println(b, "is the largest among three")
	} else {
		fmt.Println(c, "is the largest among three")
	}
}
