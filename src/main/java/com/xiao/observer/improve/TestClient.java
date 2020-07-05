package com.xiao.observer.improve;

/**
 * @Author sunjinwei
 * @Date 2020-07-05 14:29
 * @Description TODO
 **/
public class TestClient {

    public static void main(String[] args) {
        WeathSubject weathData = new WeathSubjectImpl(20f);

        weathData.add(new BaiduSite());
        WeathObserver sinaSite = new SinaSite();
        weathData.add(sinaSite);

        weathData.notifyObserver();
        System.out.println();

        weathData.remove(sinaSite);
        weathData.notifyObserver();
    }
}
