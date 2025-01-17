//https://leetcode.com/problems/neighboring-bitwise-xor

class NeighboringBitwiseXOR {
    fun doesValidArrayExist(derived: IntArray): Boolean {
        val original = IntArray(derived.size + 1)
        original[0] = 0

        derived.indices.forEach { original[it + 1] = derived[it] xor original[it] }
        val checkForZero = (original[0] == original[original.size - 1])

        original[0] = 1
        derived.indices.forEach { original[it + 1] = derived[it] xor original[it] }
        val checkForOne = (original[0] == original[original.size - 1])

        return checkForZero || checkForOne
    }
}
