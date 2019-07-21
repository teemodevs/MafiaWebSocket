package teemoDevs.MafiaWebSocket.chat.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import teemoDevs.MafiaWebSocket.chat.model.Message;
import teemoDevs.MafiaWebSocket.chat.model.OutputMessage;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class ChatApiController {
    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessage send(Message message) {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message.getFrom(), message.getText(), time);
    }
}
