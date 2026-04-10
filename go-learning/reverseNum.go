package main

import "fmt"

func main() {
	var num int
	fmt.Print("Enter the number to reverse: ")
	fmt.Scan(&num)

	temp := num
	rev := 0

	for temp > 0 {
		rev = rev*10 + temp%10
		temp /= 10
	}

	fmt.Println("After reversal:", rev)

	if num == rev {
		fmt.Println("Number is Palindrome")
	} else {
		fmt.Println("Number is Not Palindrome")
	}
}
