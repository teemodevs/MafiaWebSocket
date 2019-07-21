package teemoDevs.MafiaWebSocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class SpringWebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        // enable an in-memory message broker to carry the messages back to the client on destinations prefixed with "/topic".
        config.enableSimpleBroker("/topic");

        // designating the "/app" prefix to filter destinations targeting application annotated methods (via @MessageMapping).
        config.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // enabling Spring’s STOMP support
        registry.addEndpoint("/chat");

        // enables the SockJS fallback options, so that alternative messaging options may be used if WebSockets are not available
        registry.addEndpoint("/chat").withSockJS();
    }
}
