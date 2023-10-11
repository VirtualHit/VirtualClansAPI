package es.virtualhit.virtualclansapi.messenger.message;

public class Message {

    private final MessageType type;

    public Message(MessageType type) {
        this.type = type;
    }

    public MessageType getType() {
        return type;
    }

    public enum MessageType {
        PLAYER_MESSAGE,
        BROADCAST_MESSAGE,
        DISPLAY_CLAN_MESSAGE,
        DISPLAY_BROADCAST_MESSAGE,
        CLAN_CHAT_MESSAGE,
        ALLY_CHAT_MESSAGE,
        WEEK_RESET
    }
}
