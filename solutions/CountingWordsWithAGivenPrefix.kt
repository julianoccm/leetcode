//https://leetcode.com/problems/counting-words-with-a-given-prefix
//Solution details: https://leetcode.com/submissions/detail/1502911502

class CountingWordsWithAGivenPrefix {
    fun prefixCount(words: Array<String>, pref: String): Int {
        var counter = 0

        for (word in words) {
            if(word.startsWith(pref)) {
                counter++
            }
        }

        return counter
    }
}
