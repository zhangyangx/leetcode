package cn.zy.leetcode.simple;

import org.junit.jupiter.api.Test;

/**
 * <a href="https://leetcode.cn/problems/palindrome-number/">...</a>
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * <p>
 * 回文数
 * 是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 例如，121 是回文，而 123 不是。
 *
 * @author yang.zhang
 * @since 2024/9/29
 */
public class Solution21 {

    @Test
    public void test() {
        System.out.println(isPalindrome(0));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        String s = String.valueOf(x);
        if (s.endsWith("0")) {
            return false;
        }

        String first = s.substring(0, s.length() / 2);
        String second = s.substring(s.length() / 2);

        if (first.length() < second.length()) {
            first += second.charAt(0);
        }
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(first.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
