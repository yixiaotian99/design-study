package com.xiao.test01.openCloseTest;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: Alert
 * @description: 使用开闭原则 ---基于扩展来实现新功能
 * @author: sunjinwei
 * @date: 2022/9/26 17:24
 **/
public class Alert3 {

    /**
     * 封装多个 handler
     */
    List<AbstractAlertHandler> handlerList = new ArrayList<>(8);

    /**
     * 定义check
     */
    public void check(){
        handlerList.forEach(po->{
            ApiInfo apiInfo = new ApiInfo();
            po.check(apiInfo);
        });
    }
}


/**
 * 将原 check 方法入参封装到对象中
 */
@Data
class ApiInfo {

    private String api;
    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;
    private long timeoutCount;
}

/**
 * 面向接口进行编程
 */
abstract class AbstractAlertHandler {

    private AlertRule alertRule;
    private Notification notification;

    public AbstractAlertHandler(AlertRule alertRule, Notification notification) {
        this.alertRule = alertRule;
        this.notification = notification;
    }

    /**
     * 定义 check 抽象方法
     */
    public abstract void check(ApiInfo apiInfo);
}

/**
 * 定义 tps 预警处理类
 */
class TpsAlertHandler extends AbstractAlertHandler {

    public TpsAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiInfo apiInfo) {
        //我只处理和 tps 相关的报警类
    }
}

/**
 * 定义 错误 相关报警类
 */
class ErrorAlertHandler extends AbstractAlertHandler {

    public ErrorAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiInfo apiInfo) {
        //我只处理和 错误 相关的报警类
    }
}




