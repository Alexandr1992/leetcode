class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var leftIndex = 0
        var rightIndex = nums.size - 1

        while (leftIndex <= rightIndex){
            val midIndex = leftIndex + (rightIndex - leftIndex) / 2
            val midValue = nums[midIndex]

            if (midValue == target){
                return midIndex
            } else if (target > midValue){
                //Target is in right
                leftIndex = midIndex + 1
            } else {
                //Target is in left
                rightIndex = midIndex - 1
            }
        }

        return -1
    }
}