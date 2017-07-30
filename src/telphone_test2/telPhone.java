package telphone_test2;

import java.util.Scanner;

/**
 * Created by think on 2017/7/30.
 */
public class telPhone {
    float screen;
    float mem;
    float cpu;
    public telPhone(){
        System.out.println("无参的构造方法");

    }
    public telPhone(float newscreen,float newmem,float newcpu){
        if (newscreen < 4f){
            System.out.println("自动赋值4f");//传值得安全性；
            screen =4f;
        }
        else {
            screen= newscreen;
        }
//        screen = newscreen;
        cpu = newcpu;
        mem = newmem;
        System.out.println("有参的构造方法");

    }
}
