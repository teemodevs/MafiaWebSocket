package teemoDevs.MafiaWebSocket.game.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Server")
public class Server implements Serializable {
    private String serverName;
    @Id private String ip;

    public Server(String serverName, String ip) {
        this.serverName = serverName;
        this.ip = ip;
    }

    public String getServerName() {
        return serverName;
    }

    public Server setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public Server setIp(String ip) {
        this.ip = ip;
        return this;
    }
}
