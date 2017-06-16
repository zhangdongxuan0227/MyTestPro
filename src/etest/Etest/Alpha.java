package etest.Etest;/**
 * Created by 寮犳槦鏅� on 2017/6/15.
 */

/**
 * @title: Alpha
 * @description:
 * @author: 寮犳槦鏅�
 */
public class Alpha {
    public void foo(String... args){
        System.out.println("Alpha:foo");
    }

    public void bar(String a) {
        System.out.println("Alpha:bar");
    }
static class Beta extends Alpha {

    public void foo(String a){
        System.out.println("Beta:foo");
    }

    public void bar(String a){
        System.out.println("Beta:bar");
    }

    public void car(String a){
        System.out.println("nihao");
    }
}
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Alpha a = new Beta();
//        Beta b = (Beta)a;
        a.foo("zxc");
        a.foo("test");
//        b.foo("test");
        a.bar("test");
//        b.bar("test");

    }

}
