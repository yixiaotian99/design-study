package com.xiao.test01.di;

/**
 * @className: DiTest
 * @description: 依赖注入DI 不通过new来创建对接，将创建操作交给框架
 * @author: sunjinwei
 * @date: 2022/9/30 15:49
 * @see https://time.geekbang.org/column/article/177444
 **/
public class DiTest {

    public static void main(String[] args) {
        //使用非注入方式
        Notification notification = new Notification();
        notification.sendMsg();

        //使用依赖注入 DI 的方式进行属性注入
        MessageSender messageSender = new MessageSender();
        NotificationDi notificationDi = new NotificationDi(messageSender);
        notificationDi.sendMsg();

        //使用面向接口方式进行属性注入
        MessageSenderInterface sender = new SmsSender();
        NotificationDiInterface notificationDi1 = new NotificationDiInterface(sender);
        notificationDi1.sendMsg();
    }
}


/**
 * 使用非注入方式 即使用 new 创建对象
 */
class Notification{

    private MessageSender messageSender;

    /**
     * 在无参的构造方法中，使用 new 创建对象
     */
    public Notification() {
        this.messageSender = new MessageSender();
    }

    /**
     * 调用发送方法
     */
    public void sendMsg(){
        this.messageSender.send();
    }
}

/**
 * 定义消息发送者
 */
class MessageSender{

    public void send(){
        System.out.println("发送消息~~~");
    }
}

/**
 * 使用 DI 依赖注入的方式进行属性值注入
 */
class NotificationDi{

    private MessageSender messageSender;

    public NotificationDi(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    /**
     * 调用发送方法
     */
    public void sendMsg(){
        this.messageSender.send();
    }
}

/**
 * 面向接口进行编辑
 */
interface MessageSenderInterface{

    void send();
}

/**
 * 实现类
 */
class SmsSender implements MessageSenderInterface{

    @Override
    public void send() {
        System.out.println("手机发送消息~~~");
    }
}

/**
 * 使用 DI 依赖注入的方式进行属性值注入
 */
class NotificationDiInterface{

    private MessageSenderInterface messageSender;

    public NotificationDiInterface(MessageSenderInterface messageSender) {
        this.messageSender = messageSender;
    }

    /**
     * 调用发送方法
     */
    public void sendMsg(){
        this.messageSender.send();
    }
}

