package romantsisyk.github.io.lib.algorithms.algorithms

class TreeTraversals {
    fun inorderTraversal(root: romantsisyk.github.io.lib.algorithms.algorithms.TreeTraversals.TreeNode?): List<Int> {
        if (root == null) return emptyList()
        return inorderTraversal(root.left) + root.value + inorderTraversal(root.right)
    }

    fun preorderTraversal(root: romantsisyk.github.io.lib.algorithms.algorithms.TreeTraversals.TreeNode?): List<Int> {
        if (root == null) return emptyList()
        return listOf(root.value) + preorderTraversal(root.left) + preorderTraversal(root.right)
    }

    fun postorderTraversal(root: romantsisyk.github.io.lib.algorithms.algorithms.TreeTraversals.TreeNode?): List<Int> {
        if (root == null) return emptyList()
        return postorderTraversal(root.left) + postorderTraversal(root.right) + listOf(root.value)
    }

    data class TreeNode(val value: Int, val left: romantsisyk.github.io.lib.algorithms.algorithms.TreeTraversals.TreeNode? = null, val right: romantsisyk.github.io.lib.algorithms.algorithms.TreeTraversals.TreeNode? = null)
}