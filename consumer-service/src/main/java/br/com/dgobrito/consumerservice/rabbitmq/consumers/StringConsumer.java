package br.com.dgobrito.consumerservice.rabbitmq.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class StringConsumer {
	
	@RabbitListener(queues = {"product.log"})
	public void consumer(String message) {
		log.info("Consumer received a message " + message);		
	}
}