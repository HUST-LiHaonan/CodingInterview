/**
 * Copyright (C), 2016-2020, 李浩楠
 * FileName: ReplaceBlank
 * Author:   mac
 * Date:     2020/1/1 7:11 下午
 * Description: 剑指offer第五题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package GetOffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈剑指offer第五题〉
 *
 * @author mac
 * @create 2020/1/1
 * @since 1.0.0
 */
public class ReplaceBlank {
    public static String replace(String s){
        String ans = "";
        String[] str = s.split(" ");
        for (int i=0;i<str.length-1;i++){
            ans = ans+str[i]+"%20";
        }
        ans = ans+str[str.length-1];
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(replace("We are happy."));
    }
}

