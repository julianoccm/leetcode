//https://leetcode.com/problems/counting-words-with-a-given-prefix/

package exercises

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