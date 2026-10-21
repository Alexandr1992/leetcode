class Solution {
    fun findClosestNumber(nums: IntArray): Int {
        var closestDistance = Int.MAX_VALUE

        for (num in nums){
            val closestDistanceAbs = Math.abs(closestDistance)
            if (closestDistanceAbs > Math.abs(num) || num == closestDistanceAbs){
                closestDistance = num
            }
        }

        return closestDistance
    }
}