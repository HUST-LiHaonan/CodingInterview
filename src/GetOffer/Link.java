/**
 * Copyright (C), 2016-2020, 李浩楠
 * FileName: Link
 * Author:   mac
 * Date:     2020/1/2 9:58 上午
 * Description: 链表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package GetOffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈链表〉
 *
 * @author mac
 * @create 2020/1/2
 * @since 1.0.0
 */
public class Link {
    public Entry head;

    public Link() {
        this.head = new Entry();
    }

    @Override
    public String toString() {
        Entry p = head;
        String str = "[ ";
        while (p!=null){
            str = str + p.data + " ";
            p = p.next;
        }
        str = str + "]";
        return str;
    }
}

