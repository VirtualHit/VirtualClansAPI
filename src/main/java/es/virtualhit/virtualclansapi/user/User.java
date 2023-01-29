package es.virtualhit.virtualclansapi.user;

import es.virtualhit.virtualclansapi.user.chat.ChatStatus;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

public abstract class User {

    private final UUID uuid;
    private UUID clanUUID;
    private LocalDateTime lastDonation;
    private ChatStatus chatStatus;

    public User(UUID uuid) {
        this.uuid = uuid;
        this.clanUUID = null;
        this.lastDonation = LocalDateTime.ofEpochSecond(0, 0, ZoneOffset.UTC);
        this.chatStatus = ChatStatus.GLOBAL;
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

    public LocalDateTime getLastDonation() {
        return lastDonation;
    }

    public void setLastDonation(LocalDateTime lastDonation) {
        this.lastDonation = lastDonation;
    }

    public ChatStatus getChatStatus() {
        return chatStatus;
    }

    public void setChatStatus(ChatStatus chatStatus) {
        this.chatStatus = chatStatus;
    }
}
