package etest.Etest;/**
 * Created by 寮犳槦鏅� on 2017/6/13.
 */

/**
 * @title: StringAgrs
 * @description:
 * @author: zhangxingchen
 */
import java.util.Arrays;
public class StringAgrs {
    public static void main(String [] args)  // 也可以写成 （String args[]）
    {
        int [] a ={1,2,3};
        int [] b = a;
        for (int i=0;i<a.length;i++){
            b[i]++;
        }
        System.out.println("arrry:"+Arrays.toString(b));
        for (int c:b) {
            System.out.println("值：" + c);
        }
    }
}
