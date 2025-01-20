//https://leetcode.com/problems/first-completely-painted-row-or-column
//Solution details: https://leetcode.com/submissions/detail/1515040408

class FirstCompletelyPaintedRowOrColumn {
    fun firstCompleteIndex(arr: IntArray, mat: Array<IntArray>): Int {
        val rows = mat.size
        val cols = mat[0].size

        val valueToPosition = HashMap<Int, IntArray>()
        for (row in 0 until rows) {
            for (col in 0 until cols) {
                valueToPosition[mat[row][col]] = intArrayOf(row, col)
            }
        }

        val rowMap = IntArray(mat.size){0}
        val colMap = IntArray(mat[0].size){0}

        for (i in arr.indices) {
            val pos = valueToPosition.getOrDefault(arr[i], intArrayOf())
            val row = pos[0]
            val col = pos[1]

            rowMap[row] += 1
            colMap[col] += 1

            if (colMap[col] == rows || rowMap[row] == cols) {
                return i
            }
        }

        return 0
    }
}
