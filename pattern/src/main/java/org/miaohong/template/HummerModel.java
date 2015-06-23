package org.miaohong.template;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();

    protected abstract void engnineBoom();
    protected abstract void alarm();
    public final void run() {
        this.start();
        this.engnineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    //钩子方法
    protected boolean isAlarm(){
        return true;
    }
}
