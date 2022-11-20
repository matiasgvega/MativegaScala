package problems.leetcode

/**
 *
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.


Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11

 * https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan&id=level-1
 */
object PivotIndex {

    def pivotIndex(nums: Array[Int]): Int = {
//        val leftSums = nums.scanLeft(0) { (sum, x) => sum + x }.drop(1)
        val leftSums = nums.scanLeft(0)(_ + _).drop(1)
//        val rightSums = nums.scanRight(0) { (sum, x) => sum + x }.dropRight(1)
        val rightSums = nums.scanRight(0)(_ + _).dropRight(1)
        leftSums.iterator
            .zipWithIndex
            .indexWhere { case (leftSum, idx) => rightSums(idx) == leftSum }
    }

    // def pivotIndex(nums: Array[Int]): Int = {
    //     val l = nums.scanLeft(0)(_ + _).tail
    //     val r = nums.scanRight(0)(_ + _).dropRight(1)
    //     l.zip(r)
    //       .zipWithIndex
    //       .filter({case ((a,b), i) => a == b})
    //       .headOption
    //       .map({case (_, i) => i})
    //       .getOrElse(-1)
    // }
}