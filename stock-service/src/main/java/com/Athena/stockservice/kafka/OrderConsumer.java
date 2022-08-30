package com.Athena.stockservice.kafka;

import com.Athena.domain.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author Wayne Sidney
 * Created on {09/08/2022}
 */
@Service
public class OrderConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(topics="${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(OrderEvent orderEvent){
        LOGGER.info(String.format("Message received -> %s", orderEvent.toString()));

    }


}
