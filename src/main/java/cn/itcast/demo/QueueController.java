package cn.itcast.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息生产者
 */
@RestController
public class QueueController {



    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;


    @RequestMapping("/send")
    public void send(String text){
       jmsMessagingTemplate.convertAndSend("itcast",text);
    }
}
