package teemoDevs.MafiaWebSocket.chat.model;

public class OutputMessage {
    private String from;
    private String text;
    private String time;

    public OutputMessage(String from, String text, String time) {
        this.from = from;
        this.text = text;
        this.time = time;
    }

    public String getFrom() {
        return from;
    }

    public OutputMessage setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getText() {
        return text;
    }

    public OutputMessage setText(String text) {
        this.text = text;
        return this;
    }

    public String getTime() {
        return time;
    }

    public OutputMessage setTime(String time) {
        this.time = time;
        return this;
    }
}
