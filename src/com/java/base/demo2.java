package com.java.base;
import java.util.Scanner;

/**
 * Created by think on 2017/7/23.
 */

/*实现三个班级的4个学员的平均分
* 二重循环，外层控制班级数量，内层控制班级学员数量
*
* */
public class demo2 {
    public static void main(String[] args) {
        int classNum = 3;
        int stuNum = 4;

        double avg = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= classNum ; i++) {
            double sum = 0;
            System.out.println("***输入第"+i+"个班的成绩***");
            for (int j = 1; j <= stuNum ; j++) {
                System.out.println("***请输入第"+j+"个学员的成绩：");
                int score = input.nextInt();
                sum += score;
            }
            avg = sum/stuNum;
            System.out.println("第"+i+"个班级的平均分是："+avg);
        }
    }
}
