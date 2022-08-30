package com.Athena.orderservice.controller;

import com.Athena.domain.dto.Order;
import com.Athena.domain.dto.OrderEvent;
import com.Athena.orderservice.kafka.OrderProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Wayne Sidney
 * Created on {09/08/2022}
 */
@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @Autowired
    private OrderProducer orderProducer;

    @PostMapping("/orders")
    public String placeOrder(@RequestBody Order order){

        order.setOrderId(UUID.randomUUID().toString());

        OrderEvent orderEvent = new OrderEvent();
        orderEvent.setStatus("Pending");
        orderEvent.setMessage("order is in pending state");
        orderEvent.setOrder(order);

        orderProducer.sendMessage(orderEvent);

        return "***Order placed successfully***";
    }
}
