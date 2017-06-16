package etest.Etest;

/**
 * Created by zxc   字符串反转
 * on 2017/6/13.
 */
public class StringReverse {
    public static void main(String[] args){
        String str1 = "zxcser";
//        String str2 = new StringBuffer(str1).reverse().toString();
        StringBuffer str2 = new StringBuffer(str1);
        String str3 = str2.reverse().toString();
        System.out.println("反转前："+str1);
        System.out.println("反转后："+str3);
    }
}
