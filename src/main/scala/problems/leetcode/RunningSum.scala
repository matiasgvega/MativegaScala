package problems.leetcode



/**
 *
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

 *
 * https://leetcode.com/problems/running-sum-of-1d-array/?envType=study-plan&id=level-1
 */
object RunningSum {

    def runningSum(nums: Array[Int]): Array[Int] = {
//        nums.view.scanLeft(0)(_+_).tail.toArray
//        nums.iterator.scanLeft(0)(_+_).toArray.tail
        nums.scanLeft(0)(_+_).tail
    }

}
