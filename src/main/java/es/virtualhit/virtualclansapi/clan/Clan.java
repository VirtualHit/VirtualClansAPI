package es.virtualhit.virtualclansapi.clan;

import es.virtualhit.virtualclansapi.clan.rank.ClanPermission;
import es.virtualhit.virtualclansapi.clan.rank.ClanRank;
import net.william278.huskhomes.position.Position;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public abstract class Clan {

    private final UUID uuid;
    private String name;
    private String description;
    private ItemStack banner;
    private UUID leader;
    private List<UUID> members;
    private List<UUID> onlineMembers;
    private int experience;
    private HashMap<String, ClanRank> ranks;
    private List<UUID> allies;
    private HashMap<Integer, Inventory> chests;
    private Position home;
    private Inventory mailbox;

    // TODO: Quests, shop, money, settings

    public Clan(UUID uuid, String name, UUID leader) {
        this.uuid = uuid;
        this.name = name;
        this.leader = leader;

        this.description = "";
        this.members = new ArrayList<>();
        this.onlineMembers = new ArrayList<>();
        this.experience = 0;
        this.ranks = new HashMap<>();
        this.allies = new ArrayList<>();
        this.chests = new HashMap<>();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemStack getBanner() {
        return banner;
    }

    public void setBanner(ItemStack banner) {
        this.banner = banner;
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

    public List<UUID> getAllies() {
        return allies;
    }

    public void setAllies(List<UUID> allies) {
        this.allies = allies;
    }

    public HashMap<Integer, Inventory> getChests() {
        return chests;
    }

    public void setChests(HashMap<Integer, Inventory> chests) {
        this.chests = chests;
    }

    public Position getHome() {
        return home;
    }

    public void setHome(Position home) {
        this.home = home;
    }

    public Inventory getMailbox() {
        return mailbox;
    }

    public void setMailbox(Inventory mailbox) {
        this.mailbox = mailbox;
    }

    public abstract int calculateLevel();

    public abstract boolean hasPermission(UUID member, ClanPermission permission);
    
    public abstract void teleportHome(Player player);
}
