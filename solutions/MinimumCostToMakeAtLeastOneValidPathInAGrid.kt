class MinimumCostToMakeAtLeastOneValidPathInAGrid {
    fun minCost(grid: Array<IntArray>): Int {
        val directions = arrayOf(
            intArrayOf(0,1),
            intArrayOf(0,-1),
            intArrayOf(1,0),
            intArrayOf(-1,0)
        )

        val rowsSize = grid.size
        val columnsSize = grid[0].size
        
        val queue = PriorityQueue<Triple<Int, Int, Int>>(compareBy { it.third })
        queue.offer(Triple(0, 0, 0))
        
        val minMemo = Array(rowsSize) { IntArray(columnsSize) { Int.MAX_VALUE } }
        minMemo[0][0] = 0

        while (queue.isNotEmpty()) {
            val (row, column, cost) = queue.poll()!!
            
            if (row == rowsSize - 1 && column == columnsSize - 1) return cost
            
            for (direction in directions.indices) {
                val nextRow = row + directions[direction][0]
                val nextColumn = column + directions[direction][1]
                
                if (nextRow !in 0 until rowsSize || nextColumn !in 0 until columnsSize) continue
                
                val nextCost = if (direction + 1 == grid[row][column]) cost else cost + 1
                
                if (nextCost < minMemo[nextRow][nextColumn]) {
                    minMemo[nextRow][nextColumn] = nextCost
                    queue.offer(Triple(nextRow, nextColumn, nextCost))
                }
            }
        }
        
        return -1
    }
}
