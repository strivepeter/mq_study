package com.peter.mq.controller;/**
 * Created by DELL on 2019/7/9.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.stereotype.Component;

/**
 * @ClassName MsgReceiver
 * @Description TODO
 * @Author peter
 * @Date 2019/7/9 13:38
 * @Version 1.0
 */
@Component
//@RabbitListener(queues = RabbitConfig.QUEUE_B)
public class MsgReceiver {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void process(String content) {
        logger.info("接收处理队列B当中的消息： " + content);
    }

}
