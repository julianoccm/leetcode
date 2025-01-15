//https://leetcode.com/problems/minimize-xor

class MinimizeXOR {
    fun countSetBits(x: Int): Int {
        var x = x
        var count = 0
        while (x != 0) {
            count += x and 1
            x = x shr 1
        }
        return count
    }

    fun minimizeXor(num1: Int, num2: Int): Int {
        val targetBitsCount = countSetBits(num2)
        var result = 0
        var setBitsCount = 0
        var currentBit = 31 // Most significant bit.

        while (setBitsCount < targetBitsCount) {
            if ((num1 and (1 shl currentBit)) != 0 || (targetBitsCount - setBitsCount > currentBit)) {
                result = result or (1 shl currentBit)
                setBitsCount++
            }
            currentBit--
        }
        return result
    }
}
