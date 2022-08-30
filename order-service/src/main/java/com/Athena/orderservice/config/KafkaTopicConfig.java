package com.Athena.orderservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author Wayne Sidney
 * Created on {09/08/2022}
 */
@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String topicName;

    //create a bean for a topic
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name(topicName).build();
    }

}
