/**
 * Copyright (C), 2016-2020, 李浩楠
 * FileName: Singleton
 * Author:   mac
 * Date:     2020/1/1 9:47 上午
 * Description: 剑指offer第二题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package GetOffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈剑指offer第二题〉
 *
 * @author mac
 * @create 2020/1/1
 * @since 1.0.0
 */
public class Singleton {
    private static Singleton instance;

    public Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}

