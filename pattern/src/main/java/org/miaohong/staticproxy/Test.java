package org.miaohong.staticproxy;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public class Test {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Subject proxy = new Proxy(realSubject);

        proxy.request();
    }
}
