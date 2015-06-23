package org.miaohong.factory;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public class Test {

    public static void main(String[] args) {
        AbstractHumanFactory yinyanlu = new HumanFactory();

        Human human = yinyanlu.creatHuman(WhiteHuman.class);
        human.getColor();
        human.talk();

        human = yinyanlu.creatHuman(BlackHuman.class);
        human.getColor();
        human.talk();

        human = yinyanlu.creatHuman(YellowHuman.class);
        human.getColor();
        human.talk();
    }
}
