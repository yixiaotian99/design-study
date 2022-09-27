package com.xiao.test01.openCloseTest;

/**
 * @className: Alert
 * @description: 使用开闭原则
 * @author: sunjinwei
 * @date: 2022/9/26 17:24
 **/
public class Alert {

    private AlertRule alertRule;
    private Notification notification;

    public Alert(AlertRule alertRule, Notification notification) {
        this.alertRule = alertRule;
        this.notification = notification;
    }

    /**
     * 定义检查方法
     */
    public void check(String api, long requestCount, long errorCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;

        //如果 tps 大于报警阀值，触发报警
//        if (tps > alertRule.getMatchedRule(api).getMaxTps()) {
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }

        //如果错误数量超过报警阀值，触发报警
//        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
//            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
//        }
    }
}

/**
 * 报警规则
 */
class AlertRule {
}

/**
 * 告警通知类
 */
class Notification {
}