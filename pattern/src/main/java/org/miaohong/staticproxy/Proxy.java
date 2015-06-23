package org.miaohong.staticproxy;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public class Proxy implements Subject{
    private Subject subject = null;

    public Proxy() {
        this.subject = new Proxy();
    }

    public Proxy(Subject subject){
        this.subject = subject;
    }

    private void befor() {
        System.out.println("befor");
    }

    private void after() {
        System.out.println("after");
    }

    public void request() {
        this.befor();
        this.subject.request();
        this.after();
    }
}
