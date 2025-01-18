//https://leetcode.com/problems/two-sum
//Solution details: https://leetcode.com/submissions/detail/1505187772

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { currentIndex, num1 ->
            for (nextIndex in currentIndex + 1 until nums.size) {
                val num2 = nums[nextIndex]
                if (num1 + num2 == target) {
                    return intArrayOf(currentIndex, nextIndex)
                }
            }
        }
        return intArrayOf()
    }
}
