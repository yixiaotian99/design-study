package com.xiao.test01.extendTest;

/**
 * @className: AbstractFlyableBird
 * @description: 抽象不会飞的鸟
 * @author: sunjinwei
 * @date: 2022/9/19 15:37
 **/
public class AbstractUnFlyableBird extends AbstracBird{

    /**
     * 不会飞的鸟
     */
    @Override
    public void fly(){
        throw new UnsupportedOperationException();
    }

}
