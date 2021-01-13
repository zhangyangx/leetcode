package cn.zy.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/goal-parser-interpretation/
 * 请你设计一个可以解释字符串 command 的 Goal 解析器 。command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成。Goal 解析器会将 "G" 解释为字符串 "G"、"()" 解释为字符串 "o" ，"(al)" 解释为字符串 "al" 。然后，按原顺序将经解释得到的字符串连接成一个字符串。
 * 给你字符串 command ，返回 Goal 解析器 对 command 的解释结果。
 *
 * @author ZhangYang
 * @date 2021/1/13
 */
public class Solution09 {

    public static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
    }
}
