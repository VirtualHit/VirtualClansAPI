package es.virtualhit.virtualclansapi.user;

import java.util.UUID;

public abstract class User {

    private final UUID uuid;
    private UUID clanUUID;

    public User(UUID uuid) {
        this.uuid = uuid;
        this.clanUUID = null;
    }

    public UUID getUuid() {
        return uuid;
    }

    public UUID getClanUUID() {
        return clanUUID;
    }

    public void setClanUUID(UUID clanUUID) {
        this.clanUUID = clanUUID;
    }
}
