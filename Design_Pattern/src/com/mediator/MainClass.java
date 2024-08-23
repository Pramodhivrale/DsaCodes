package com.mediator;

class MainClass {
	
	public static void main(String[] args) {
		ChatRoom chatRoom = new ChatRoom();

		User u1 = new User("jhon", chatRoom);
		User u2 = new User("jane", chatRoom);

		chatRoom.addUser(u1);
		chatRoom.addUser(u2);

		u1.sendMessage("Hello jhon !");
		u2.sendMessage("Hello jane !");

	}
}
