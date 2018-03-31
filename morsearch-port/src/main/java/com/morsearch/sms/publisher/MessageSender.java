package com.morsearch.sms.publisher;

import org.springframework.jms.core.JmsTemplate;

import javax.jms.Destination;

/**
 * 发送消息
 * Created by Administrator on 2017/10/16.
 */
public class MessageSender {

    private final JmsTemplate jmsTemplate;
    private final Destination destination;

    public MessageSender(final JmsTemplate jmsTemplate, final Destination destination) {
        this.jmsTemplate = jmsTemplate;
        this.destination = destination;
    }

    public void send(final String text) {
        try {
            jmsTemplate.setDefaultDestination(destination);
            jmsTemplate.convertAndSend(text);
            System.out.println("发送消息 : " + text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
