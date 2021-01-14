package cn.zy.leetcode.simple;

/**
 * @author ZhangYang
 * @date 2021/1/14
 */
public class Solution16 {
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
