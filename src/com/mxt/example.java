/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: example
 * Author:   27259
 * Date:     2019/11/4 16:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.mxt;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 27259
 * @create 2019/11/4
 * @since 1.0.0
 */
public class example {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        ListNode head = new ListNode(0);
        ListNode node = head;
        for(int i = 1; i < 10; i++) {
            ListNode temp = new ListNode(i);
            node.next = temp;
            node = node.next;
        }
        

        while(head != null){
            if(head.next != null) {
                System.out.print(head.val + " --> ");
            } else {
                System.out.println(head.val);
            }
            head = head.next;
        }
    }
}

class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}