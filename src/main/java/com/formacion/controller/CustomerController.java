package com.formacion.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.formacion.messaging.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    Producer producer;

    @GetMapping("/send")
    public void sendMessage() throws JsonProcessingException {
        producer.sendCustomer();
    }
}
