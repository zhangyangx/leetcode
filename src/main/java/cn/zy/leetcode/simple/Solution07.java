package cn.zy.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/jewels-and-stones/
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * @author ZhangYang
 * @date 2021/1/13
 */
public class Solution07 {
    public static int numJewelsInStones(String jewels, String stones) {
//        int i = 0;
//        char[] stonesChar = stones.toCharArray();
//        for (char c : stonesChar) {
//            if (jewels.contains(c + "")) {
//                i++;
//            }
//        }
//        return i;

        int i = 0;
        for (int j = 0; j < stones.length(); j++) {
            if (jewels.contains(String.valueOf(stones.charAt(j)))) {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAcc"));
    }
}
