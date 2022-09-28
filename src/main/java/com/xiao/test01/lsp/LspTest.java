package com.xiao.test01.lsp;

/**
 * @className: LspTest
 * @description: 里氏替换原则
 * @author: sunjinwei
 * @date: 2022/9/27 14:21
 * @see https://time.geekbang.org/column/article/177110
 **/
public class LspTest {


}


/**
 * 定义父类
 */
class Bird {
    public void fly() {
        System.out.println("我是鸟，我会飞");
    }
}

/**
 * 定义子类
 *
 */
class Eagle extends Bird {
    @Override
    public void fly() {
        //如果正常输出，没有其他比如异常，即满足 LSP 原则
        System.out.println("我是老鹰，我会飞");

        //如果有异常输出，和父类的行为不匹配，只能说是满足多态，并不满足 LSP 原则
        //throw new UnsupportedOperationException();
    }
}