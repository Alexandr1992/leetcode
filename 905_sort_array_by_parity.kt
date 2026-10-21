class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        
        val evenNums = mutableListOf<Int>()
        val oddNums = mutableListOf<Int>()

        nums.forEach{ i->
            if (i %2 == 0){
                evenNums += i
            } else {
                oddNums += i
            }
        }
        
        return (evenNums + oddNums).toIntArray()
    }
}