package com.gracedemos.chat_room_server;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    ChatRoom chatRoom;

    public Controller() {
        chatRoom = new ChatRoom();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ChatRoom getChatRoom() {
        return chatRoom;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addMessage(@RequestBody String[] message) {
        chatRoom.addMessage(message[0], message[1]);
        return "OK";
    }
}
