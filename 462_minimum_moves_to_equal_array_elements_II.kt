class Solution {
    fun minMoves2(nums: IntArray): Int {
        if (nums.size == 0){
            return 0
        }

        var minIndex = 0
        var maxIndex = nums.size - 1
        var totalDistance = 0

        nums.sort()

        while (minIndex == maxIndex || maxIndex > minIndex){
            val max = nums[maxIndex] 
            val min = nums[minIndex]

            totalDistance = totalDistance + (max - min)

            --maxIndex
            ++minIndex
        }

        return totalDistance       
    }
}