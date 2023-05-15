package com.formacion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.formacion.messaging.Producer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringKafkaApplicationTests {

	@Autowired
	Producer producer;

	@Test
	void contextLoads() throws JsonProcessingException {
		producer.sendCustomer();
	}

}
