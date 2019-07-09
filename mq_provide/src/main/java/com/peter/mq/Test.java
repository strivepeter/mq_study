package com.peter.mq;/**
 * Created by DELL on 2019/7/9.
 */

import com.peter.mq.msg.MsgProducer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Test
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/9 11:19
 * @Version 1.0
 */
@RestController
@RequestMapping("mq")
public class Test {
    @Autowired
    private RabbitTemplate rabbitTemplate;


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void Test() {
        MsgProducer msgProducer = new MsgProducer(rabbitTemplate);
        for (int i = 0; i < 100000; i++) {
            msgProducer.sendAll(String.format("我的消息=%s",i));
            System.out.println(String.format("我的消息=%s",i));
        }
    }

    public static void main(String[] args) {



    }


}
