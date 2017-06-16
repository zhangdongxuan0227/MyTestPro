package com.java.base;

/**
 * Created by zhangxingchen on 2017/6/8.
 */
import java.util.Scanner;
//判断输入的是不是整数
public class ArrySort {
    public static void main(String args[]){

        Scanner scan=new Scanner(System.in);
        String str =scan.next();

       int Num=0;
        try {
            Num = Integer.parseInt(str);
        }
        catch (NumberFormatException e)
        {      //捕获异常，并且处理
            System.out.println("你输入的是非法数字");
        }

        System.out.println("你输入的是整数"+Num);

    }
}
