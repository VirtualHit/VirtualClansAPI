package es.virtualhit.virtualclansapi.clan;

import es.virtualhit.virtualclansapi.clan.rank.ClanPermission;
import es.virtualhit.virtualclansapi.clan.rank.ClanRank;
import es.virtualhit.virtualclansapi.clan.setting.ClanSetting;
import es.virtualhit.virtualclansapi.serializer.BukkitSerializer;
import net.william278.huskhomes.position.Position;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public abstract class Clan {

    private final UUID uuid;
    private String name;
    private String displayName;
    private String description;
    private String banner;
    private UUID leader;
    private List<UUID> members;
    private List<UUID> onlineMembers;
    private int experience;
    private int level;
    private HashMap<String, ClanRank> ranks;
    private List<UUID> allies;
    private HashMap<Integer, List<String>> chests;
    private Position home;
    private List<String> mailboxItems;
    private UUID playerWithMailboxOpen;
    private BigDecimal balance;
    private HashMap<String, ClanSetting> settings;
    private HashMap<String, Object> shopData;
    private int kills;
    private int deaths;

    // TODO: Quests

    public Clan(UUID uuid, String name, UUID leader) {
        this.uuid = uuid;
        this.name = name;
        this.displayName = name;
        this.leader = leader;

        this.description = "";
        this.members = new ArrayList<>();
        this.onlineMembers = new ArrayList<>();
        this.experience = 0;
        this.level = 1;
        this.ranks = new HashMap<>();
        this.allies = new ArrayList<>();
        this.chests = new HashMap<>();
        this.mailboxItems = new ArrayList<>();
        this.playerWithMailboxOpen = null;
        this.balance = new BigDecimal(0);
        this.settings = new HashMap<>();
        this.shopData = new HashMap<>();
        this.kills = 0;
        this.deaths = 0;
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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ItemStack getBanner() {
        return BukkitSerializer.fromBase64(banner);
    }

    public void setBanner(ItemStack banner) {
        this.banner = BukkitSerializer.toBase64(banner);
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    public HashMap<Integer, List<ItemStack>> getChests() {
        HashMap<Integer, List<ItemStack>> chests = new HashMap<>();
        for (int i = 0; i < this.chests.size(); i++) {
            chests.put(i, BukkitSerializer.fromBase64(this.chests.get(i)));
        }

        return chests;
    }

    public void setChests(HashMap<Integer, List<ItemStack>> chests) {
        HashMap<Integer, List<String>> chestsSerialized = new HashMap<>();
        for (int i = 0; i < chests.size(); i++) {
            chestsSerialized.put(i, BukkitSerializer.toBase64(chests.get(i)));
        }

        this.chests = chestsSerialized;
    }

    public Position getHome() {
        return home;
    }

    public void setHome(Position home) {
        this.home = home;
    }

    public List<ItemStack> getMailboxItems() {
        return BukkitSerializer.fromBase64(mailboxItems);
    }

    public void setMailboxItems(List<ItemStack> mailboxItems) {
        this.mailboxItems = BukkitSerializer.toBase64(mailboxItems);
    }

    public UUID getPlayerWithMailboxOpen() {
        return playerWithMailboxOpen;
    }

    public void setPlayerWithMailboxOpen(UUID playerWithMailboxOpen) {
        this.playerWithMailboxOpen = playerWithMailboxOpen;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void addBalance(BigDecimal balance) {
        this.balance = this.balance.add(balance);
    }

    public void takeBalance(BigDecimal balance) {
        this.balance = this.balance.subtract(balance);
    }

    public HashMap<String, ClanSetting> getSettings() {
        return settings;
    }

    public void setSettings(HashMap<String, ClanSetting> settings) {
        this.settings = settings;
    }

    public HashMap<String, Object> getShopData() {
        return shopData;
    }

    public void setShopData(HashMap<String, Object> shopData) {
        this.shopData = shopData;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public abstract int calculateLevel();

    public abstract boolean hasPermission(UUID member, ClanPermission permission);
    
    public abstract void teleportHome(Player player);

    public abstract ClanRank getRankWithLowerWeight();

    public abstract ClanRank getPlayerRank(UUID member);
}
