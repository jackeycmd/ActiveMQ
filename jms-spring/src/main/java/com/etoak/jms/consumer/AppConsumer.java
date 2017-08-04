package com.etoak.jms.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 消费者
 */
public class AppConsumer {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

    }
}
