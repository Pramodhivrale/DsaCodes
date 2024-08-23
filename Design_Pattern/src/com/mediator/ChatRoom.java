package com.mediator;

import java.util.List;

public class ChatRoom {
	public List<User> userss;

	public void sendMessage(User user, String message) {
		for (User u : userss) {
			if (u != user) {
				u.reciveMessage(user, message);
			}
		}
	}
	public void addUser(User user) {
		userss.add(user);
	}

}

class User {

	private String name;
	private ChatRoom chatRoom;

	public String getName() {
		return name;
	}

	public ChatRoom getChatRoom() {
		return chatRoom;
	}

	public User(String name, ChatRoom chatRoom) {
		this.name = name;
		this.chatRoom = chatRoom;
	}

	public void sendMessage(String message) {
		chatRoom.sendMessage(this, message);
	}

	public void reciveMessage(User user, String message) {
		System.out.println(user.getName() + " sent " + message);
	}
}


