class Solution {

    fun permute(nums: IntArray): List<List<Int>> {
        val result: MutableList<List<Int>> = mutableListOf()

        if (nums.isEmpty()) return result
        if (nums.size == 1) return listOf<List<Int>>(nums.toList())
            
        if (nums.size == 2){
            result.add(listOf(nums[0], nums[1]))
            result.add(listOf(nums[1], nums[0]))
            return result

        } else if (nums.size > 2){
            for (i in 0..< nums.size) {
                val nextArray = nums.toMutableList()
                nextArray.removeAt(i)

                permute(nextArray.toIntArray()).forEach{ arrays ->
                    result.add(listOf(nums[i]) + arrays)
                }
            }    
        }

        return result
    }
}