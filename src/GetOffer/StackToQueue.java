/**
 * Copyright (C), 2016-2020, 李浩楠
 * FileName: StackToQueue
 * Author:   mac
 * Date:     2020/1/5 4:00 下午
 * Description: 剑指offer第九题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package GetOffer;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈剑指offer第九题〉
 *
 * @author mac
 * @create 2020/1/5
 * @since 1.0.0
 */
public class StackToQueue {
    private Stack<Character> stack1;
    private Stack<Character> stack2;

    public StackToQueue() {
        stack1 = new Stack <>();
        stack2 = new Stack <>();
    }

    public boolean appendTail(char c){
        stack1.push(c);
        return true;
    }

    public char deleteHead() throws Exception {
        if(stack2.size()<=0){
            while (stack1.size()>0){
                char c = stack1.peek();
                stack1.pop();
                stack2.push(c);
            }
        }else {
            char c = stack2.peek();
            stack2.pop();
            return c;
        }

        if(stack2.size()==0)
            throw new Exception();

        char head = stack2.peek();
        stack2.pop();
        return head;
    }


    public static void main(String[] args) {
        StackToQueue stackToQueue = new StackToQueue();
        stackToQueue.appendTail('a');
        stackToQueue.appendTail('b');
        stackToQueue.appendTail('c');
        try {
            System.out.println(stackToQueue.deleteHead());
            System.out.println(stackToQueue.deleteHead());
            System.out.println(stackToQueue.deleteHead());
            System.out.println(stackToQueue.deleteHead());
        } catch (Exception e) {
            System.out.println("队列已空");
        }
    }
}

