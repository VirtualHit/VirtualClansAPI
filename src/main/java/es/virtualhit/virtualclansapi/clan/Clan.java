package es.virtualhit.virtualclansapi.clan;

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
}
