/**
 * Copyright (C), 2016-2020, 李浩楠
 * FileName: FirstShow
 * Author:   mac
 * Date:     2020/1/1 10:00 上午
 * Description: 剑指offer第五十题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package GetOffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈剑指offer第五十题〉
 *
 * @author mac
 * @create 2020/1/1
 * @since 1.0.0
 */
public class FirstShow {
    public  char firstShow(String s){
        char[] str = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap <>();
        char ans = ' ';
        //初始化字典
        for (int i=0;i<str.length;i++){
            map.put(str[i],0);
        }
        //将字符出现次数构造成键值对
        for (int i=0;i<str.length;i++){
            int time = map.get(str[i]);
            map.put(str[i],++time);
        }
        //将只出现一次的字符加入链表
        List<Character> firstList = new ArrayList <>();
        for (Character c:
             map.keySet()) {
            if(map.get(c)==1)
                firstList.add(c);
        }
        //如果没有只出现一次的，直接返回空
        if(firstList.size()==0){
            return ans;
        }
        //比较判断哪个字符是第一次出现的
        int min=s.indexOf(firstList.get(0));
        ans = firstList.get(0);
        for (Character c:
             firstList) {
            int index = s.indexOf(c);
            if(index<=min)
                ans = c;
        }

        return ans;
    }

    public static void main(String[] args) {
        FirstShow firstShow = new FirstShow();
        String str = "aaabbfcfe";
        System.out.println(firstShow.firstShow(str));
    }
}

