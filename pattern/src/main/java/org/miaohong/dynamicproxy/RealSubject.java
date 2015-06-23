package org.miaohong.dynamicproxy;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public class RealSubject implements Subject {
    public void doSomething() {
        System.out.println( "call doSomething()" );
    }

    public void doAnatherthing() {
        System.out.println( "call doAnatherthing()" );
    }
}
