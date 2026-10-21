/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun goodNodes(root: TreeNode?): Int {
        if (root == null){
            return 0
        }

        return goodNodes(root, root.`val`)
    }

    private fun goodNodes(root: TreeNode?, maxValue: Int): Int {
        if (root == null){
            return 0
        }

        val id = root.`val`
        val currentMax = max(id, maxValue)
        var totalGoodNodes = 0
        val iAmGood = id >= maxValue

        if (iAmGood){
            totalGoodNodes++
        }
    
        totalGoodNodes += goodNodes(root?.left, currentMax)
        totalGoodNodes += goodNodes(root?.right, currentMax)
    
        return totalGoodNodes
    }
}