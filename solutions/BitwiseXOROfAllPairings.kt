//https://leetcode.com/problems/bitwise-xor-of-all-pairings

class BitwiseXOROfAllPairings {
    fun xorAllNums(nums1: IntArray, nums2: IntArray): Int {
        val nums1Length = nums1.size
        val nums2Length = nums2.size

        val numsFrequency = HashMap<Int, Int>()

        nums1.forEach { 
            num1 -> numsFrequency[num1] = numsFrequency.getOrDefault(num1, 0) + nums2Length 
        }
        
        nums2.forEach { 
            num2 -> numsFrequency[num2] = numsFrequency.getOrDefault(num2, 0) + nums1Length 
        }

        var xorSum = 0

        for (num in numsFrequency.keys) {
            if (numsFrequency[num]!! % 2 == 1) {
                xorSum = xorSum xor num
            }
        }

        return xorSum
    }
}
