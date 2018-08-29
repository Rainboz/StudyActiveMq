package com.example.demo.main;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @program: StudyActiveMq
 * @description: ${description}
 * @author: ls
 * @create: 2018-08-29 18:19
 */
@Component
public class consumerqueue {
    @JmsListener(destination = "mvp.topic",containerFactory="jmsListenerContainerTopic")
    public void receiveTopic(String text){
        System.out.println("Topic Consumer1:"+text);
    }
    @JmsListener(destination = "mvp.topic",containerFactory="jmsListenerContainerTopic")
    public void receiveTopic2(String text){
        System.out.println("Topic Consumer2:"+text);
    }
    @JmsListener(destination = "mvp.queue",containerFactory="jmsListenerContainerQueue")
    public void reviceQueue(String text){
        System.out.println("Queue Consumer:"+text);
        System.out.println("");
    }
}