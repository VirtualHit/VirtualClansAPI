package es.virtualhit.virtualclansapi.invite;

import java.util.Locale;

public abstract class Invite {
    private final String id;

    public Invite(String senderName, String receiverName) {
        this.id = senderName.toLowerCase(Locale.ROOT) + receiverName.toLowerCase(Locale.ROOT);
    }

    public String getId() {
        return id;
    }
}
