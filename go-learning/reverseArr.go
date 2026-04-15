package main

import "fmt"

func main() {
    var n int
    fmt.Print("Enter the size of array: ")
    fmt.Scan(&n)

    arr := make([]int, n)

    fmt.Println("Enter elements:")
    for i := 0; i < n; i++ {
        fmt.Scan(&arr[i])
    }

    result := reverse(arr)
    fmt.Println("Reverse Array is:", result)
}

func reverse(arr []int) []int {
    i, j := 0, len(arr)-1

    for i < j {
        arr[i], arr[j] = arr[j], arr[i]
        i++
        j--
    }
    return arr
}