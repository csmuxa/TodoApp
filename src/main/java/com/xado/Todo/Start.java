package com.xado.Todo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        TodoDaoImpl todo=(TodoDaoImpl)ctx.getBean("TodoDaoIml");

    }
}
