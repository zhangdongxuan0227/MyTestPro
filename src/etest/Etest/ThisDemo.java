package etest.Etest;

/**
 * Created by zxc on 2017/6/12.
 */
public class ThisDemo {
    String name;
    int age;
    public ThisDemo (){
        this.age=21;
    }
    public ThisDemo(String name,int age){
        this();
        this.name="Mick";
    }
    private void print(){
        System.out.println("最终名字="+this.name);
        System.out.println("最终的年龄="+this.age);
    }
    public static void main(String[] args) {
        ThisDemo tt=new ThisDemo("",0); //随便传进去的参数
        tt.print();
    }
}