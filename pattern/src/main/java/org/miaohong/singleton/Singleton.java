package org.miaohong.singleton;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }


    private Singleton(){

    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}


class SingletonThread {
    private static final ThreadLocal<SingletonThread> local =
            new ThreadLocal<SingletonThread>() {
                @Override
                protected SingletonThread initialValue() {
                    return new SingletonThread();
                }
            };

    private SingletonThread(){}

    public static SingletonThread getISingleton(){
        return local.get();
    }

}