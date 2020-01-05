/**
 * Copyright (C), 2016-2020, 李浩楠
 * FileName: Entry
 * Author:   mac
 * Date:     2020/1/2 10:06 上午
 * Description: 链表节点
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package GetOffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈链表节点〉
 *
 * @author mac
 * @create 2020/1/2
 * @since 1.0.0
 */
public class Entry {
    int data;
    Entry next;

    public Entry(int data) {
        this.data = data;
        this.next = null;
    }

    public Entry() {
        this.data = -1;
        this.next = null;
    }
}

