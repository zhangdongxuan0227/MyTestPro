package etest.Etest;/**
 * Created by 寮犳槦鏅� on 2017/6/14.
 */

/**
 * @title: HeapOOM
 * @description:
 * @author: zxc
 */
import java.util.*;
public class HeapOOM {

    static class OOMObject{}

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while(true){
            list.add(new OOMObject());
        }
    }

}