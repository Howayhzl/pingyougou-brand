package cn.itcast.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Comsumer {


    @JmsListener(destination = "itcast")
    public void readMessage(String text){
        System.out.println("接受到消息："+text);
    }
}
