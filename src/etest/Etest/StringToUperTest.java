package etest.Etest;

/**
 * Created by zxc on 2017/6/13. 字符串大小写转换  toUpperCase 方法，转换小写是str.toLowerCase()
 */
public class StringToUperTest {
    public static void main (String[] args){
        String str = "zxcbbasd2345";
        String str1 = str.toUpperCase();  //str.toLowerCase()小写
        System.out.println("初始字符串:"+str);
        System.out.println("转换后字符串："+str1);
    }
}
