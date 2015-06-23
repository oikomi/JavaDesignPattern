package org.miaohong.template;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public abstract class HummerModel {
    public abstract void start();
    public abstract void stop();

    public abstract void engnineBoom();
    public abstract void alarm();
    public void run() {
        this.start();
        this.engnineBoom();
        this.alarm();
        this.stop();
    }
}
