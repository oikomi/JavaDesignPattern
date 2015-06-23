package org.miaohong.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public class ProxyHandler implements InvocationHandler {
    private Object target;

    //绑定委托对象，并返回代理类
    public Object bind(Object target)
    {
        this.target = target;
        //绑定该类实现的所有接口，取得代理类
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //这里就可以进行所谓的AOP编程了
        //在调用具体函数方法前，执行功能处理
        System.out.println("即将调用" + method.getName());
        result = method.invoke(target, args);
        //在调用具体函数方法后，执行功能处理
        if (method.getName().equals("doAnatherthing")) {
            System.out.println("you call doAnatherthing");
        }
        return result;
    }
}
