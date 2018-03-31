package com.morsearch.sms.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * 接收消息
 * Created by Administrator on 2017/10/16.
 */
public class MessageReceiver implements MessageListener {
    public void onMessage(Message message) {
        if (message instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) message;
            try {
                String text = textMessage.getText();
                System.out.println("接收到消息: " + text);
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
