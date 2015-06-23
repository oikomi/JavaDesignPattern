package org.miaohong.staticproxy;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public class RealSubject implements Subject {
    public void request() {
        System.out.println("do request");
    }
}
