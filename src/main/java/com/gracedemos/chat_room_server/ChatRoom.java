package com.gracedemos.chat_room_server;
import java.util.ArrayList;

public class ChatRoom {
    private int totalMessages;
    private ArrayList<String[]> messages;

    public ChatRoom() {
        totalMessages = 0;
        messages = new ArrayList<String[]>();
    }

    public void addMessage(String user, String message) {
        String[] newMessage = {user, message};
        messages.add(newMessage);
        totalMessages++;
    }

    public ArrayList<String[]> getMessages() {
        return messages;
    }

    public int getTotalMessages() {
        return totalMessages;
    }
}
