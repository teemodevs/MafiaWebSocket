package teemoDevs.MafiaWebSocket.chat.model;

public class Message {
    private String from;
    private String text;

    public Message setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    public String getText() {
        return this.text;
    }
}
