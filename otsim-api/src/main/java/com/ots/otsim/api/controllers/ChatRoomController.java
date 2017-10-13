package com.ots.otsim.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ots.otsim.api.model.json.ChatMessage;
import com.ots.otsim.api.model.json.ChatRoom;
import com.ots.otsim.api.model.json.JSONUser;

@RestController
@RequestMapping(path="/chatrooms") 
public class ChatRoomController {
	
	@PostMapping(path="/user-rooms")
	public @ResponseBody List<ChatRoom> getUserChatRooms(@RequestBody JSONUser user) {
		List<ChatRoom> chatRooms = new ArrayList<>();
		chatRooms.add(new ChatRoom("Λογιστική"));
		chatRooms.add(new ChatRoom("Μισθοδοσία"));
		chatRooms.add(new ChatRoom("Ύδρευση"));
		return chatRooms;		
	}
	
	@PostMapping(path="/room-messages")
	public @ResponseBody List<ChatMessage> getChatRoomMessages(@RequestBody ChatRoom chatRoom) {
		List<ChatMessage> chatMessages = new ArrayList<>();
		chatMessages.add(new ChatMessage("535d625f898df4e80e2a125e", "Fotzu isoko vo adget ne uba in lup jedzow mi uvinifse epepo het ezezocic bahehufep lid pubuj.", 
				"topkas", "Jean", "http://polyligne.be/wp-content/uploads/2014/06/Man_Avatar.gif", "1455110273886"));
		chatMessages.add(new ChatMessage("535f13ffee3b2a68112b9fc0", "Hu girucajam ifuolocag za nifjem ninze dak kadi wi zowolhim asa vouczu ci.", 
				"4562KDJYE72930DST283DFY202Dd", "Billy Jean", "http://polyligne.be/wp-content/uploads/2014/06/Man_Avatar.gif", "1455110273886"));
		chatMessages.add(new ChatMessage("546a5843fd4c5d581efa263a", "Vad vo ujcofwag pelobhuz wonogmo cikutew imoissuv no doso jum govhi peva aj ven narzir gac rofbufubo il.", 
				"topkas", "Jean", "http://polyligne.be/wp-content/uploads/2014/06/Man_Avatar.gif", "1455110173886"));		

		return chatMessages;		
	}
}
