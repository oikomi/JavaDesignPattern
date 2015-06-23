package org.miaohong.template;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("H2 start");
    }

    @Override
    protected void stop() {
        System.out.println("H2 stop");
    }

    @Override
    protected void engnineBoom() {
        System.out.println("H2 engnineBoom");
    }

    @Override
    protected void alarm() {
        System.out.println("H2 alarm");
    }

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
