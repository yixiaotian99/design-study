package com.xiao.test01.extendTest;

/**
 * @className: Ostrich
 * @description:  定义鸵鸟类
 * @author: sunjinwei
 * @date: 2022/9/19 15:21
 **/
public class Ostrich extends AbstracBird{

    /**
     * 鸵鸟不会飞，抛出不支持的异常
     * 虽然可以，但是违背了最小知识原则或者迪米特法则，暴露了不该暴露的接口给外部，增加了类使用过程中的误用概率
     */
    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
