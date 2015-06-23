package org.miaohong.factory;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T creatHuman(Class<T> c);
}
