package main

import "fmt"

func main() {
	var num int

	fmt.Print("Enter the number to check prime: ")
	fmt.Scan(&num)

	isPrime := true

	if num <= 1 {
		isPrime = false
	}

	for i := 2; i*i <= num; i++ {
		if num%i == 0 {
			isPrime = false
			break
		}
	}

	if isPrime {
		fmt.Println(num, "is a Prime Number")
	} else {
		fmt.Println(num, "is Not a Prime Number")
	}
}
