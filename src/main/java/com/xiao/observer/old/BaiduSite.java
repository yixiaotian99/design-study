package com.xiao.observer.old;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author sunjinwei
 * @Date 2020-07-05 14:25
 * @Description 百度网站订阅天气预报
 **/
public class BaiduSite {

    /**
     * 天气预报 温度
     */
    @Setter
    @Getter
    private float temperature;

    public void display(){
        System.out.println("==百度网站 天气预报== 温度: " + this.temperature);
    }

}
