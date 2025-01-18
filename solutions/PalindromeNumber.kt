//https://leetcode.com/problems/palindrome-number
//Solution details: https://leetcode.com/submissions/detail/1506296894

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        return x.toString() == x.toString().reversed()
    }
}
