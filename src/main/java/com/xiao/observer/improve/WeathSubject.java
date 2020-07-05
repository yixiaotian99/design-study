package com.xiao.observer.improve;

/**
 * @Author sunjinwei
 * @Date 2020-07-05 14:36
 * @Description 定义发布者接口
 **/
public interface WeathSubject {

    /**
     * 新增
     */
    void add(WeathObserver weathObserver);

    /**
     * 删除
     */
    void remove(WeathObserver weathObserver);

    /**
     * 通知所有订阅者
     */
    void notifyObserver();
}
