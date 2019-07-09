package com.peter.mq.controller;/**
 * Created by DELL on 2019/7/9.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.stereotype.Component;

/**
 * @ClassName MsgReceiverC_one
 * @Description TODO
 * @Author DELL
 * @Date 2019/7/9 17:43
 * @Version 1.0
 */
@Component
//@RabbitListener(queues = RabbitConfig.QUEUE_A)
public class MsgReceiverC_one {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void process(String content) {
        logger.info("处理器one接收处理队列A当中的消息： " + content);
    }
}

