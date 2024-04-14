package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangchen
 * 两数之和
 * <p>
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * 解题思路
 * 把数组中的值，存储到hashmap中，key为值，value放置index，当遍历时发现组队相加为目标值时，退出循环，返回数值对应的index。
 */
public class Title1_TheSumOfTwoNumbers {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            for (int i = j+1; i < nums.length; i++) {
                if (nums[j] + nums[i] == target) {
                    list.add(j);
                    list.add(i);
                }
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        Title1_TheSumOfTwoNumbers title1TheSumOfTwoNumbers = new Title1_TheSumOfTwoNumbers();
        title1TheSumOfTwoNumbers.twoSum(new int[]{2,7,11,15},9);
    }
}
