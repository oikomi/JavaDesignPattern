package org.miaohong.template;

/**
 * Created by haroldmiao on 2015/6/23.
 */
public class Test {

    public static void main(String[] args) {
        HummerH1Model h1 = new HummerH1Model();
        h1.setIsALarmFlag(false);
        h1.run();

        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}
