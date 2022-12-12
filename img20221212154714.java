package com.atguigu.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //启动注册 bean MainConfig，所以不需要加 @Component注解
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println(ctx.getBean("person"));
        System.out.println(ctx.getBean("car"));
    }
}