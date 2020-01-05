/**
 * Copyright (C), 2016-2020, 李浩楠
 * FileName: FindRepetition
 * Author:   mac
 * Date:     2020/1/1 5:54 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package GetOffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈剑指offer第三题〉
 *
 * @author mac
 * @create 2020/1/1
 * @since 1.0.0
 */
public class FindRepetition {
    public int duplicate(int[] a){
        int length = a.length;
        if(a==null){
            return -1;
        }

        for(int i=0;i<a.length;i++){
            if(a[i]<0||a[i]>length-1)
                return -1;
        }

        for (int i=0;i<a.length;i++){
            while (a[i]!=i){
                if(a[i]==a[a[i]]){
                    return a[i];
                }
                int temp = a[i];
                a[i] = a[temp];
                a[temp] = temp;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        FindRepetition findRepetition = new FindRepetition();
        int[] a ={2,3,1,0,2,5,3};
        System.out.println(findRepetition.duplicate(a));
    }
}

