// https://leetcode.com/problems/two-sum/description/

// brute force - O(n^2)

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {

                if (nums[j] + nums[j - i] == target)
                    return new int[] { j - i, j };

            }

        }

        return null;

    }
}

// Optimized - O(n)

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }

        return new int[] {};
    }
}
