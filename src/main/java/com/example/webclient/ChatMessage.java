package com.example.webclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {
	
	private String sender;
	private String content;
	private MesssageType type; 
	
	
	public enum MesssageType{
		CHAT,LEAVE,JOIN
	}

}
