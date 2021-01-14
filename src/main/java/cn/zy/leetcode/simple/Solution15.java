package cn.zy.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/guess-numbers/
 * 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，请返回 小A 猜对了几次？
 * 输入的guess数组为 小A 每次的猜测，answer数组为 小B 每次的选择。guess和answer的长度都等于3。
 *
 * @author ZhangYang
 * @date 2021/1/14
 */
public class Solution15 {
    public static int game(int[] guess, int[] answer) {
//        int res = 0;
//        for (int i = 0; i < guess.length; i++) {
//            if (guess[i] == answer[i]) {
//                res++;
//            }
//        }
//        return res;

        int res = 0;
        int i = 0;
        while (i < 3) {
            if (guess[i] == answer[i]) {
                res++;
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
