package teemoDevs.MafiaWebSocket.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import teemoDevs.MafiaWebSocket.game.model.Server;
import teemoDevs.MafiaWebSocket.repository.cache.ServerRepository;

@RestController
public class CacheController {

    @Autowired
    private ServerRepository serverRepository;

    @GetMapping("/cache")
    public String cacheSave() {
        Server server = new Server("server1", "127.0.0.1");
        this.serverRepository.save(server);
        Server savedServer = this.serverRepository.findById("127.0.0.1").get();
        return savedServer.getServerName() + ", " + savedServer.getIp();
    }
}
