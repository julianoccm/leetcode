//https://leetcode.com/problems/grid-game
//Solution details: https://leetcode.com/submissions/detail/1516197037

class GridGame {
    fun gridGame(grid: Array<IntArray>): Long {
        val n = grid[0].size
        var suffix0 = 0L
        for (i in 1 until n) {
            suffix0 += grid[0][i]
        }
        var result = suffix0
        var prefix1 = 0L
        for (i in 1 until n) {
            suffix0 -= grid[0][i]
            prefix1 += grid[1][i - 1]
            result = minOf(result, maxOf(suffix0, prefix1))
        }
        return result
    }
}
