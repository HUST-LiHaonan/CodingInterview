/**
 * Copyright (C), 2016-2020, 李浩楠
 * FileName: Backwards
 * Author:   mac
 * Date:     2020/1/1 7:18 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package GetOffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author mac
 * @create 2020/1/1
 * @since 1.0.0
 */
public class Backwards {
    //定义链表节点
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public static Node find(Node node,int k){
        if(node == null)
            return null;
        if(k<=0)
            return null;
        Node a = node;
        Node b = node;

        return null;
    }

    public static void main(String[] args) {

    }

}

