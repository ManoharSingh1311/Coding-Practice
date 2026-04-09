package main

import "fmt"

func main() {
	//Method 1 : Standard declaration
	var name string = "Manohar"
	fmt.Println("Hello, ", name)
	//Method 2: Type inference(go can automatically detetct type)
	//var : used anywhere
	// := only inside functions
	var age = 22
	fmt.Println("Age", age)
	//Method 3:
	name1 := "Singh"
	fmt.Println("Hi ", name1)

	var a, b int = 5, 10
	fmt.Println(a, b)
	c, d := 10, 20
	fmt.Println(c, d)
	a, b, z := 10, 20, 50
	fmt.Println(a, b, z)
}
