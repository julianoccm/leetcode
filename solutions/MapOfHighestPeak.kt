//https://leetcode.com/problems/map-of-highest-peak
//Solution details: https://leetcode.com/submissions/detail/1517311123

class MapOfHighestPeak {
    fun highestPeak(isWater: Array<IntArray>): Array<IntArray> {
        val m = isWater.size
        val n = isWater[0].size

        val heights = Array<IntArray>(m) { IntArray(n) { -1 } }

        val queue = ArrayDeque<List<Int>>() // [[i, j, height], ...]
        
        for (i in 0..<m) {
            for (j in 0..<n) {
                if (isWater[i][j] == 1) {
                    queue.addLast(listOf(i, j, 0))
                }
            }
        }

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()

            val i = current[0]
            val j = current[1]
            val h = current[2]

            if (i < 0 || i >= m || j < 0 || j >= n || heights[i][j] != -1) {
                continue
            }

            heights[i][j] = h

            queue.add(listOf(i + 1, j, h + 1))
            queue.add(listOf(i - 1, j, h + 1))
            queue.add(listOf(i, j + 1, h + 1))
            queue.add(listOf(i, j - 1, h + 1))
        }

        return heights
    }
}
