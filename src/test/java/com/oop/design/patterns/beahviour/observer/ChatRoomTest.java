package com.oop.design.patterns.beahviour.observer;

import org.junit.Test;

public class ChatRoomTest {
	
	@Test
	public void testChatRoom() {
		
		ChatRoom chatRoom = new ChatRoom();
		
		//Participants in the chatroom
		Participant one = new Participant("One");
		Participant two = new Participant("two");
		Participant three = new Participant("three");
		
		chatRoom.add(one);
		chatRoom.add(two);
		chatRoom.add(three);
		
		chatRoom.notification();
	}
	
}
