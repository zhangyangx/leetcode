package cn.zy.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/design-parking-system/
 * 请你给一个停车场设计一个停车系统。停车场总共有三种不同大小的车位：大，中和小，每种尺寸分别有固定数目的车位。
 * <p>
 * 请你实现 ParkingSystem 类：
 * ParkingSystem(int big, int medium, int small) 初始化 ParkingSystem 类，三个参数分别对应每种停车位的数目。
 * bool addCar(int carType) 检查是否有 carType 对应的停车位。 carType 有三种类型：大，中，小，分别用数字 1， 2 和 3 表示。一辆车只能停在  carType 对应尺寸的停车位中。如果没有空车位，请返回 false ，否则将该车停入车位并返回 true 。
 *
 * @author ZhangYang
 * @date 2021/1/14
 */
public class Solution19 {

    int[] arr;

    public Solution19(int big, int medium, int small) {
        arr = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        return arr[carType - 1]-- > 0;
    }

    public static void main(String[] args) {
        Solution19 solution19 = new Solution19(1, 1, 1);
        System.out.println(solution19.addCar(1));
        System.out.println(solution19.addCar(1));
    }
}
