package com.peter.cusmq.controller;/**
 * Created by DELL on 2019/7/9.
 */


import com.peter.cusmq.config.RabbitConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ClassName MsgReceiver
 * @Description TODO
 * @Author peter
 * @Date 2019/7/9 13:38
 * @Version 1.0
 */
@Component
//@RabbitListener(queues = RabbitConfig.QUEUE_C)
@RabbitListener(queues ="QUEUE_B")
public class MsgReceiver {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void process(Map<String,String> content) {
        logger.info("接收处理队列C当中的消息： " + content.get("id"));
        logger.info("接收处理队列C当中的消息： " + content.get("msg"));
    }

}
