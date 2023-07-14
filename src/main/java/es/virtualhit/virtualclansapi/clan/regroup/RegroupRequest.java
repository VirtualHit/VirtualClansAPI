package es.virtualhit.virtualclansapi.clan.regroup;

import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;

import java.util.UUID;

public abstract class RegroupRequest {

    private final UUID clanUUID;
    private final TeleportPoint teleportPoint;
    private final UUID senderUUID;

    public RegroupRequest(UUID clanUUID, TeleportPoint teleportPoint, UUID senderUUID) {
        this.clanUUID = clanUUID;
        this.teleportPoint = teleportPoint;
        this.senderUUID = senderUUID;
    }

    public UUID getClanUUID() {
        return clanUUID;
    }

    public TeleportPoint getTeleportPoint() {
        return teleportPoint;
    }

    public UUID getSenderUUID() {
        return senderUUID;
    }
}
