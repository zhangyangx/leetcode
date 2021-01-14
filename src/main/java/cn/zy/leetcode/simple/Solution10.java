package cn.zy.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * @author ZhangYang
 * @date 2021/1/14
 */
public class Solution10 {
    public static int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.merge(num, 1, Integer::sum);
//        }
//        int max = 0;
//        int res = 0;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > max){
//                max = entry.getValue();
//                res = entry.getKey();
//            }
//        }
//        return res;

//        Arrays.sort(nums);
//        return nums[nums.length / 2];

        int count = 1;
        int candidate = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (candidate == nums[i]) {
                count++;
            } else {
                count--;
                // 若count为0，更换候选人
                if (count == 0) {
                    candidate = nums[i];
                    count++;
                }
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2, 9}));
    }
}
