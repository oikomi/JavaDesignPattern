package org.miaohong.template;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public class HummerH1Model extends HummerModel{
    private boolean isALarmFlag = true;

    public void setIsALarmFlag(boolean isALarmFlag) {
        this.isALarmFlag = isALarmFlag;
    }


    @Override
    protected void start() {
        System.out.println("H1 start");
    }

    @Override
    protected void stop() {
        System.out.println("H1 stop");
    }

    @Override
    protected void engnineBoom() {
        System.out.println("H1 engnineBoom");
    }

    @Override
    protected void alarm() {
        System.out.println("H1 alarm");
    }

    @Override
    protected boolean isAlarm() {
        return isALarmFlag;
    }
}
