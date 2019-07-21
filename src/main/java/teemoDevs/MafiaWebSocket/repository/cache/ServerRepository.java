package teemoDevs.MafiaWebSocket.repository.cache;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import teemoDevs.MafiaWebSocket.game.model.Server;

@Repository
public interface ServerRepository extends CrudRepository<Server, String> {
}
