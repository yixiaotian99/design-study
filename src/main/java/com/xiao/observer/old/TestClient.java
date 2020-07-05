package com.xiao.observer.old;

/**
 * @Author sunjinwei
 * @Date 2020-07-05 14:29
 * @Description TODO
 **/
public class TestClient {

    public static void main(String[] args) {
        WeathData weathData = new WeathData(20f);

        weathData.publishWeath();
    }
}
