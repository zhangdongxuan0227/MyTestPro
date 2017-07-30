package telphon_test;

import com.sun.deploy.trace.SocketTraceListener;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by think on 2017/7/29.
 */
public class telPhone {
    //成员变量
    float screen;
    float mem;
    float cpu;
    int var =40;
    void  call(){   //call 方法
        int var =10;
        int callvar = 2;//局部变量
        System.out.println("通话功能");
        System.out.println("var:"+var);
        System.out.println("callvar:"+callvar);
    }
    void  sendMessage(){
        System.out.println("短信功能");
        System.out.println("var:"+var);
        //System.out.println("callvar:"+callvar);
    }
}
