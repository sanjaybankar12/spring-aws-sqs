package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

	@Value("${cloud.aws.endpoint.uri}")
	private String endpoint;
	
	@Autowired
	private QueueMessagingTemplate queueMessagingTemplate;
	
	@Override
	public void sendMessage(String message) {
		this.queueMessagingTemplate.send(endpoint, MessageBuilder.withPayload(message).build());
	}

}
