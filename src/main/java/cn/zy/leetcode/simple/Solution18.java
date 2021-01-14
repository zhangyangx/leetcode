package cn.zy.leetcode.simple;

/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/submissions/
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点 。
 *
 * @author ZhangYang
 * @date 2021/1/14
 */
public class Solution18 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

