package es.virtualhit.virtualclansapi.clan;

import es.virtualhit.virtualclansapi.clan.rank.ClanPermission;
import es.virtualhit.virtualclansapi.clan.rank.ClanRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public abstract class Clan {

    private final UUID uuid;
    private String name;
    private UUID leader;
    private List<UUID> members;
    private List<UUID> onlineMembers;
    private int experience;
    private HashMap<String, ClanRank> ranks;

    public Clan(UUID uuid, String name, UUID leader) {
        this.uuid = uuid;
        this.name = name;
        this.leader = leader;
        this.members = new ArrayList<>();
        this.onlineMembers = new ArrayList<>();
        this.experience = 0;
        this.ranks = new HashMap<>();
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getLeader() {
        return leader;
    }

    public void setLeader(UUID leader) {
        this.leader = leader;
    }

    public List<UUID> getMembers() {
        return members;
    }

    public void setMembers(List<UUID> members) {
        this.members = members;
    }

    public List<UUID> getOnlineMembers() {
        return onlineMembers;
    }

    public void setOnlineMembers(List<UUID> onlineMembers) {
        this.onlineMembers = onlineMembers;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public HashMap<String, ClanRank> getRanks() {
        return ranks;
    }

    public void setRanks(HashMap<String, ClanRank> ranks) {
        this.ranks = ranks;
    }

    public abstract int calculateLevel();

    public abstract boolean hasPermission(UUID member, ClanPermission permission);
}
