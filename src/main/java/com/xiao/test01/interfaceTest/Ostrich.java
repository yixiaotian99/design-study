package com.xiao.test01.interfaceTest;

/**
 * @className: Ostrich
 * @description: 定义 is-a 关系，鸵鸟会叫，会下蛋
 * @author: sunjinwei
 * @date: 2022/9/19 15:54
 **/
public class Ostrich implements Tweetable, Egglaytable{
    @Override
    public void layEgg() {

    }

    @Override
    public void tweet() {

    }
}
