package com.xiao.observer.old;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author sunjinwei
 * @Date 2020-07-05 10:19
 * @Description 使用最原始的方式，如果气温有变化就通知第三方
 **/
public class WeathData {

    /**
     * 天气预报 温度
     */
    @Setter
    @Getter
    private float temperature;


    public WeathData(float temperature) {
        this.temperature = temperature;
    }


    /**
     * 订阅者 百度网站
     */
    private BaiduSite baiduSite = new BaiduSite();

    /**
     * 新增加 新浪网站
     */
    private SinaSite sinaSite = new SinaSite();


    /**
     * 给第三方网站 推送天气预报
     */
    public void publishWeath(){
        baiduSite.setTemperature(temperature);
        baiduSite.display();

        sinaSite.setTemperature(temperature);
        sinaSite.display();
    }


}
