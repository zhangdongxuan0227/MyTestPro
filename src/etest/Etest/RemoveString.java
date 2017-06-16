package etest.Etest;/**
 * Created by 寮犳槦鏅� on 2017/6/14.
 */

import java.security.PublicKey;

/**
 * @title: RemoveString
 * @description:
 * @author: 寮犳槦鏅�
 */
public class RemoveString {
    public static void main(String[] args) {
        String str1 = "this is Java";
        System.out.println(removechar(str1,1));
    }
    public  static  String removechar(String str2, int num){
        return str2.substring(0,num)+str2.substring(num+1);
    }

}
