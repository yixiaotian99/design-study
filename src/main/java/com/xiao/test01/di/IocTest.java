package com.xiao.test01.di;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: IocTest
 * @description: 控制反转 IOC
 * @author: sunjinwei
 * @date: 2022/9/29 16:38
 * @see https://time.geekbang.org/column/article/177444
 **/
public class IocTest {

    public static void main(String[] args) {

        //程序的控制流程，由程序员控制
        if (doTest()) {
            System.out.println("单元测试成功！");
        } else {
            System.out.println("单元测试失败！!!");
        }

        //使用自定义测试框架 将控制权将给框架来实现，如下的 new 将来可通过自动注入方式，实现反转
        JunitApplication junitApplication = new JunitApplication();
        junitApplication.register(new UserService());
    }

    /**
     * 测试方法
     *
     * @return
     */
    private static boolean doTest() {
        return false;
    }
}

/**
 * 定义抽象类
 * 子类必须实现 doTest 方法
 */
abstract class TestCase {
    public void run(){
        if (doTest()) {
            System.out.println("单元测试成功！");
        } else {
            System.out.println("单元测试失败！!!");
        }
    }

    /**
     * 子类实现方法
     * @return
     */
    public abstract boolean doTest();
}

/**
 * 用户自定义单元测试方法
 */
class UserService extends TestCase{

    @Override
    public boolean doTest() {
        return false;
    }
}

/**
 * 自定义单元测试框架
 */
class JunitApplication {
    private List<TestCase> caseList = new ArrayList<>();

    /**
     * 对外暴露方法，接收用户自定义单元测试类
     * @param testCase
     */
    public void register(TestCase testCase){
        caseList.add(testCase);
    }

    /**
     * 分别调用用户自定义方法
     */
    public void run(){
        caseList.forEach(cc ->{
            cc.run();
        });
    }
}

