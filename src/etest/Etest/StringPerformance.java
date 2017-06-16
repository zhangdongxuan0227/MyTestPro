package etest.Etest;/**
 * Created by 寮犳槦鏅� on 2017/6/14.
 */

/**
 * @title: StringPerformance
 * @description:
 * @author: zhangxingchen
 */
public class StringPerformance {
    public static void main(String[] args){
        long starttime = System.currentTimeMillis();
        for (int i=0;i<50000;i++){
            String s1 = "hello china";
            String s2 = "hello china";
        }
        long endtime = System.currentTimeMillis();
        System.out.println("通过String 创建字符串："+(endtime-starttime)+"ms");
        long starttime1 =System.currentTimeMillis();
        for (int i=0;i<50000;i++){
            String s3 = new String("hello china");
            String s4 = new String("hello china");
        }
        long endtime1 =System.currentTimeMillis();
        System.out.println("通过new 创建字符串："+(endtime1-starttime1)+"ms");
    }
}
