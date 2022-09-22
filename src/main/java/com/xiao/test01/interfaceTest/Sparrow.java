package com.xiao.test01.interfaceTest;

/**
 * @className: Sparrow
 * @description: 定义 is-a 关系，麻雀会飞、会叫，会下蛋
 * @author: sunjinwei
 * @date: 2022/9/19 15:55
 **/
public class Sparrow implements Flyable, Tweetable, Egglaytable{

    /**
     * 每个会下蛋的鸟，都要去实现类似的逻辑，会导致代码重复问题
     */
    @Override
    public void layEgg() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void tweet() {

    }
}
