package es.virtualhit.virtualclansapi.clan.ally;

import java.util.UUID;

public abstract class AllyRequest {

    private final String id;
    private final UUID requesterClanUUID;
    private final UUID requestedClanUUID;

    public AllyRequest(UUID requesterClanUUID, UUID requestedClanUUID) {
        this.id = requesterClanUUID.toString() + requestedClanUUID.toString();
        this.requesterClanUUID = requesterClanUUID;
        this.requestedClanUUID = requestedClanUUID;
    }

    public String getId() {
        return id;
    }

    public UUID getRequesterClanUUID() {
        return requesterClanUUID;
    }

    public UUID getRequestedClanUUID() {
        return requestedClanUUID;
    }
}
