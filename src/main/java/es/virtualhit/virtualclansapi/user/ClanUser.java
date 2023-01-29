package es.virtualhit.virtualclansapi.user;

import java.util.UUID;

public abstract class ClanUser {

    private final UUID uuid;
    private UUID clanUUID;

    public ClanUser(UUID uuid) {
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
