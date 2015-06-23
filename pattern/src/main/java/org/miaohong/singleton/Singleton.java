package org.miaohong.singleton;

/**
 * Created by haroldmiao on 2015/6/23.
 */

//使用静态内部类
//这种写法仍然使用JVM本身机制保证了线程安全问题；由于 SingletonHolder
// 是私有的，除了 getInstance() 之外没有办法访问它，因此它是懒汉式的；同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK 版本。
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

//线程级别的单例模式：通过ThreadLocal<T>类型的静态成员变量 定义 仅在线程内部生效的全局对象。
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