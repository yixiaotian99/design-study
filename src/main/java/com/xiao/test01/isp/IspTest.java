package com.xiao.test01.isp;

/**
 * @className: IspTest
 * @description: 接口隔离原则，只暴露调用者关心的接口
 * @author: sunjinwei
 * @date: 2022/9/28 11:41
 * @see https://time.geekbang.org/column/article/177442
 **/
public class IspTest {
}


/**
 * 用户查询接口
 * 最小颗粒度暴露用户接口
 */
interface UserService {
    void select();
}

/**
 * 用户新增接口
 * 最小颗粒度暴露用户接口
 */
interface UserAddService {
    void add();
}

/**
 * 具体用户实现类
 */
class UserServiceImpl implements UserService, UserAddService {

    @Override
    public void select() {

    }

    @Override
    public void add() {

    }
}


