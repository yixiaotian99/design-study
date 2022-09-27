package com.xiao.test01.openCloseTest;

/**
 * @className: Alert
 * @description: 使用开闭原则 ---基于修改来实现新功能
 * @author: sunjinwei
 * @date: 2022/9/26 17:24
 **/
public class Alert2 {

    private AlertRule alertRule;
    private Notification notification;

    public Alert2(AlertRule alertRule, Notification notification) {
        this.alertRule = alertRule;
        this.notification = notification;
    }

    /**
     * 定义检查方法
     * 新增加校验逻辑，每秒接口请求超时触发报警
     *
     * @param timeoutCount 新增加入参表示超时个数  ----改动一
     */
    public void check(String api, long requestCount, long errorCount, long durationOfSeconds,
                      long timeoutCount) {
        long tps = requestCount / durationOfSeconds;

        //如果 tps 大于报警阀值，触发报警
//        if (tps > alertRule.getMatchedRule(api).getMaxTps()) {
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }

        //如果错误数量超过报警阀值，触发报警
//        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
//            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
//        }

        //新增加入参超时个数     ----改动二
//        long timeoutTps = timeoutCount / durationOfSeconds;
//        if (timeoutTps > rule.getMatchedRule(api).getMaxTimeoutTps()) {
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }
    }
}

