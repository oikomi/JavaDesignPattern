package org.miaohong.factory;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T creatHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) human;
    }
}
