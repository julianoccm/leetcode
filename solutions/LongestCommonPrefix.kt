//https://leetcode.com/problems/longest-common-prefix
//Solution details: https://leetcode.com/submissions/detail/1508750742

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        val word = strs[0]
        word.forEachIndexed { i, c ->
            if (strs.any { it.length == i || it[i] != c } ) return word.substring(0, i)
        }
        return word
    }
}
