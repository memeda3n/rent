package com.rent.algorithm;

public class Link_TowNumPlus {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        return null;
    }


    public static void main(String[] args) {

    }

    private ListNode reverse(ListNode current) {

        ListNode pre = null;
        if (current != null) {
            while (current != null) {
                ListNode next = current.next;
                current.next = pre;
                pre = current;
                current = next;
            }
        }
        return pre;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}