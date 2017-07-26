package etest.Etest;

/**
 * Created  on 2017/6/13.字符串搜索 通过indexOf查询索引
 */
public class StringSearchTest {
    public static void main(String[] args){
        String str1 = "zxcserdsg";
        int str2 = str1.indexOf("ser");
        if (str2 == -1){
            System.out.println("NOT found");
        }
        else{
            System.out.println("target is:"+str2);

        }
    }
}
