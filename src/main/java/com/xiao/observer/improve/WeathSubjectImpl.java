package com.xiao.observer.improve;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sunjinwei
 * @Date 2020-07-05 14:40
 * @Description 实现发布者
 **/
public class WeathSubjectImpl implements WeathSubject {

    public WeathSubjectImpl(float temperature) {
        this.temperature = temperature;
    }

    /**
     * 天气预报 温度
     */
    @Setter
    @Getter
    private float temperature;

    /**
     * 保存订阅者
     */
    private List<WeathObserver> list = new ArrayList<>();

    @Override
    public void add(WeathObserver weathObserver) {
        list.add(weathObserver);
    }

    @Override
    public void remove(WeathObserver weathObserver) {
        if (list.contains(weathObserver)) {
            list.remove(weathObserver);
        }
    }

    @Override
    public void notifyObserver() {
        list.forEach(po ->{
            po.display(temperature);
        });
    }
}
