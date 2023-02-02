package es.virtualhit.virtualclansapi.clan.regroup;

import java.util.UUID;

public abstract class RegroupRequest {

    private final UUID clanUUID;

    public RegroupRequest(UUID clanUUID) {
        this.clanUUID = clanUUID;
    }

    public UUID getClanUUID() {
        return clanUUID;
    }
}
