package com.xiao;

import cn.hutool.core.exceptions.UtilException;
import cn.hutool.json.JSONUtil;
import lombok.Data;
import cn.hutool.core.util.ReflectUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}


@Data
class PP{
    private String key;
    private String value;

    public PP(String key, String value) {
        this.key = key;
        this.value = value;
    }
}

@Data
class QQ{
    private String name1;
//    private String name2;
    private String name3;
}


class Test{
    public static void main(String[] args) {
        PP p1 = new PP("name1", "张三1");
        PP p2 = new PP("name2", "张三2");
        PP p3 = new PP("name3", "张三3");

        List<PP> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        list.stream().forEach( p->{
            String key = p.getKey();
            String value = p.getValue();
            System.out.println(JSONUtil.toJsonStr(p));


            QQ q = new QQ();
            try {
                ReflectUtil.setFieldValue(q, key, value);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(JSONUtil.toJsonStr(q));
            System.out.println("===========");
        });

    }
}