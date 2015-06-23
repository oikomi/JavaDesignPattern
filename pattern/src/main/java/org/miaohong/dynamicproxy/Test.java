package org.miaohong.dynamicproxy;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public class Test {
    public static void main(String args[])
    {
        ProxyHandler proxy = new ProxyHandler();
        //绑定该类实现的所有接口
        Subject sub = (Subject) proxy.bind(new RealSubject());
        sub.doSomething();
        sub.doAnatherthing();
    }
}
