package com.formacion.messaging;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.formacion.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
public class Producer {

    @Autowired
    private KafkaTemplate<String, String> kafka;
    @Autowired
    ObjectMapper mapper;

    public void sendCustomer() throws JsonProcessingException {
        Customer customer = new Customer(1L, "John", 1000.0);
        String json = mapper.writeValueAsString(customer);
        kafka.sendDefault(json);
        kafka.send("anothertopic", json);
    }
}

