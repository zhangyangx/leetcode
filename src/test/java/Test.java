/**
 * @author zy
 * @date 2020/11/6 16:13
 */
public class Test {
    public static void main(String[] args) {
        int i = 256;

        String s = Integer.toBinaryString(i);
        System.out.println(s);
        int parseInt = Integer.parseInt(s, 2);
        System.out.println(parseInt);
    }
}
