package org.miaohong.template;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public class HummerH1Model extends HummerModel{
    @Override
    public void start() {
        System.out.println("H1 start");
    }

    @Override
    public void stop() {
        System.out.println("H1 stop");
    }

    @Override
    public void engnineBoom() {
        System.out.println("H1 engnineBoom");
    }

    @Override
    public void alarm() {
        System.out.println("H1 alarm");
    }
}
