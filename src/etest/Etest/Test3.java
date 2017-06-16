package etest.Etest;/**
 * Created by 寮犳槦鏅� on 2017/6/14.
 */

/**
 * @title: Test3
 * @description:
 * @author: zhangxingchen
 */
public  class Test3 {

    /**
     * @param args add by zxx ,Dec 9, 2008
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(new Test3().test());;
    }

    static int test()
    {
        int x = 1;
        try
        {
            return x;
        }
        finally
        {
            ++x;
        }
    }

}