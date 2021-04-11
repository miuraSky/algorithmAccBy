package main

import "fmt"

func main() {

    fmt.Print("Hello, World!")

}

func twoSum(nums []int, target int) []int {
    ret := []int{0, 0}

    for i := 0; i < len(nums) - 1; i++ {
        for j := i + 1; j < len(nums); j++ {
            if nums[i] + nums[j] == target {
                ret[0] = i;
                ret[1] = j;

                return ret;
            }
        }

    }

    return ret
}
