package com.xiao.observer.improve;

/**
 * @Author sunjinwei
 * @Date 2020-07-05 14:45
 * @Description TODO
 **/
public class BaiduSite implements WeathObserver {

    public void display(float temperature) {
        System.out.println("==百度网站 天气预报== 温度: " + temperature);
    }

}
