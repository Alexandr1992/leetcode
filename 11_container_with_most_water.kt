class Solution {
    fun maxArea(height: IntArray): Int {
        var leftIndex = 0
        var rightIndex = height.size - 1
        var maxCapacity = 0

        while (leftIndex != rightIndex){

            val leftHeight = height[leftIndex]
            val rightHeight = height[rightIndex]

            val currentHeight = min(leftHeight, rightHeight)
            val currentCapacity = currentHeight * (rightIndex - leftIndex)

            if (currentCapacity > maxCapacity){
                maxCapacity = currentCapacity
            }

            if (leftHeight > rightHeight){
                --rightIndex
            } else {
                ++leftIndex
            }
        }   

        return maxCapacity
    }
}