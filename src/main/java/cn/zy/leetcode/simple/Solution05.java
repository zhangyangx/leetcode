package cn.zy.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/delete-middle-node-lcci/
 * 实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
 *
 * @author ZhangYang
 * @date 2021/1/13
 */
public class Solution05 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
