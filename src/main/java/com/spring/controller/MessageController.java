package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController {
	
	@Autowired
	private MessageService messageService;

	@GetMapping("/{message}")
	public ResponseEntity<String> sendMessage(@PathVariable String message) {
		this.messageService.sendMessage(message);
		return new ResponseEntity<>("Message sent!!", HttpStatus.OK);
	}
}
