package es.virtualhit.virtualclansapi.clan.regroup;

import net.william278.huskhomes.position.Position;

import java.util.UUID;

public abstract class RegroupRequest {

    private final UUID clanUUID;
    private final Position position;
    private final UUID senderUUID;

    public RegroupRequest(UUID clanUUID, Position position, UUID senderUUID) {
        this.clanUUID = clanUUID;
        this.position = position;
        this.senderUUID = senderUUID;
    }

    public UUID getClanUUID() {
        return clanUUID;
    }

    public Position getPosition() {
        return position;
    }

    public UUID getSenderUUID() {
        return senderUUID;
    }
}
