package es.virtualhit.virtualclansapi.invite;

import java.util.Locale;
import java.util.UUID;

public abstract class Invite {
    private final String id;
    private final UUID clanUUID;

    public Invite(String senderName, String receiverName, UUID clanUUID) {
        this.id = senderName.toLowerCase(Locale.ROOT) + receiverName.toLowerCase(Locale.ROOT);
        this.clanUUID = clanUUID;
    }

    public String getId() {
        return id;
    }

    public UUID getClanUUID() {
        return clanUUID;
    }
}
