class Solution {
    fun minimumOperations(nums: IntArray): Int {
        val uniqueValues = BooleanArray(101)
        var count = 0
    
        for (value in nums) {
            if (value > 0 && !uniqueValues[value]) {
                uniqueValues[value] = true
                ++count
            }
        }

        return count
    }
}