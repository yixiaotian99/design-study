package com.xiao.test01.interfaceTest;

/**
 * @className: Ostrich2
 * @description: 使用 组合+委拖 模式来实现继承
 * @author: sunjinwei
 * @date: 2022/9/19 16:01
 **/
public class Ostrich2 implements Tweetable, Egglaytable{

    private EggLayAbility eggLayAbility = new EggLayAbility(); //组合

    @Override
    public void layEgg() {
        eggLayAbility.layEgg(); //委拖
    }

    @Override
    public void tweet() {

    }
}
