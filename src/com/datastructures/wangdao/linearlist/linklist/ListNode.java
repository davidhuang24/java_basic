package com.datastructures.wangdao.linearlist.linklist;

import java.util.Scanner;

public class ListNode {
    public int data;
    public ListNode next;
    ListNode (int data){
        this.data=data;
    }

    /**
     * 头插法建立链表：链表顺序和输入顺序相反
     * @return 链表头结点
     */
    public ListNode createListInsertFromFront(){
        ListNode L=null,s;
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        while (x!=999){
            s=new ListNode(x);
            s.next=L;
            L=s;
            x=scanner.nextInt();
        }
        return L;
    }


    /**
     * 尾插法建立链表：链表顺序和输入顺序一致
     * @return 链表头结点
     */
    public ListNode createListInsertFromTail() {
        ListNode L=null , s, r=null;
        boolean isHead=true;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while (x != 999) {
            s=new ListNode(x);
            if(isHead){
                L=r=s;
                isHead=false;
            }else {
                r.next=s;
                r=s;
            }
            x=scanner.nextInt();
        }
        r.next=null;
        return L;
    }

}
