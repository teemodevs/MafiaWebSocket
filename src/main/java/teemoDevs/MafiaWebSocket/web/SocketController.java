package teemoDevs.MafiaWebSocket.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SocketController {

    @GetMapping("/socket")
    public String hello() {
        return "hello";
    }

}
