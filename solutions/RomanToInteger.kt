//https://leetcode.com/problems/roman-to-integer
//Solution details: https://leetcode.com/submissions/detail/1507755144

class RomanToInteger {
    fun romanToInt(s: String): Int {
        val romanToNumber = mapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000
        )

        val simplifiedString = s
            .replace("IV", "IIII")
            .replace("IX", "VIIII")
            .replace("XL", "XXXX")
            .replace("XC", "LXXXX")
            .replace("CD", "CCCC")
            .replace("CM", "DCCCC")
        
        var sum = 0
        for (char in simplifiedString)
            sum += romanToNumber.getValue(char.toString())

        return sum
    }
}
