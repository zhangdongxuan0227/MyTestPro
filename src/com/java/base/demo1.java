package com.java.base;
import java.util.Scanner;


/**
 * Created by think on 2017/7/22.
 */

public class demo1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//创建scanner 对象
        System.out.print("输入考试成绩:");
        int score = input.nextInt();//获取用户输入信息 并保存到变量中
        int count =0; //初始化count
        System.out.println("加分前成绩："+ score);
        for (;score<60;score ++){
            count++;
        }
        System.out.println("加分后成绩:"+ score);
        System.out.println("循环次数："+ count+"次！");
    }
}



