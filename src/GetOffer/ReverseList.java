/**
 * Copyright (C), 2016-2020, 李浩楠
 * FileName: ReverseList
 * Author:   mac
 * Date:     2020/1/2 10:00 上午
 * Description: 剑指offer第六题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package GetOffer;

import javafx.scene.transform.Shear;

/**
 * 〈一句话功能简述〉<br> 
 * 〈剑指offer第六题〉
 *
 * @author mac
 * @create 2020/1/2
 * @since 1.0.0
 */
public class ReverseList {
    //逆序打印链表
    public static void reversePrint(Entry node){
        if(node!=null){
            if(node.next!=null){
                reversePrint(node.next);
            }
            System.out.print(node.data+" ");
        }
    }
    //反转链表
    public static Link reverse(Link link){
        Entry head = link.head;
        Entry p = link.head.next;
        link.head.next = null;
        while (p!=null){
            Entry r = p.next;
            p.next = head.next;
            head.next = p;
            p = r;
        }
        return link;
    }

    public static void main(String[] args) {
        Link link = new Link();
        Entry p =link.head;
        for (int i=1;i<=10;i++){
           Entry node = new Entry(i);
           p.next = node;
           p = p.next;
        }
        System.out.println(link);
        reversePrint(link.head.next);
        System.out.println();
        //反转链表
        System.out.println(reverse(link));
    }
}

