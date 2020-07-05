package com.xiao.observer.improve;

/**
 * @Author sunjinwei
 * @Date 2020-07-05 14:37
 * @Description 订阅者
 **/
public interface WeathObserver {

    /**
     * 显示天气信息
     */
    void display(float temperature);

}
