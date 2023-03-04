package es.virtualhit.virtualclansapi.clan.member;

import java.time.LocalDateTime;
import java.util.UUID;

public class ClanMember {

    private final UUID uuid;
    private final LocalDateTime joinDate;
    private String rankName;
    private boolean online;

    public ClanMember(UUID uuid, String rankName) {
        this.uuid = uuid;
        this.joinDate = LocalDateTime.now();
        this.rankName = rankName;
        this.online = true;
    }

    public UUID getUuid() {
        return uuid;
    }

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
