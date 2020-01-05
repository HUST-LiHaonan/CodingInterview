/**
 * Copyright (C), 2016-2020, 李浩楠
 * FileName: matrixFind
 * Author:   mac
 * Date:     2020/1/1 7:49 下午
 * Description: 剑指offer第四题
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package GetOffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈剑指offer第四题〉
 *
 * @author mac
 * @create 2020/1/1
 * @since 1.0.0
 */
public class matrixFind {
    public static boolean Find(int[][]a,int rows,int columns,int k){
        boolean found = false;
        if(a==null)
            return found;
        int row = 0;
        int colunm = columns-1;
        while (row < rows && colunm > 0){
            if(a[row][colunm]==k){
                found = true;
                break;
            }
            else if(a[row][colunm]>k){
                --colunm;
            }
            else{
                ++row;
            }
        }

        return found;
    }

    public static void main(String[] args) {
        int array[][] = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Find(array,4,4,0));
    }
}

