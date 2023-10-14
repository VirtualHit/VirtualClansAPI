package es.virtualhit.virtualclansapi.clan;

import es.virtualhit.virtualclansapi.clan.chest.ClanChest;
import es.virtualhit.virtualclansapi.clan.member.ClanMember;
import es.virtualhit.virtualclansapi.clan.quest.Quest;
import es.virtualhit.virtualclansapi.clan.quest.QuestID;
import es.virtualhit.virtualclansapi.clan.quest.QuestType;
import es.virtualhit.virtualclansapi.clan.rank.ClanPermission;
import es.virtualhit.virtualclansapi.clan.rank.ClanRank;
import es.virtualhit.virtualclansapi.clan.setting.ClanSetting;
import es.virtualhit.virtualclansapi.serializer.BukkitSerializer;
import es.virtualhit.virtualteleportapi.teleport.TeleportPoint;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

public abstract class Clan {

    private final UUID uuid;
    private String name;
    private String displayName;
    private String description;
    private String banner;
    private UUID leader;
    private HashMap<UUID, ClanMember> members;
    private final LocalDateTime creationDate;
    private int experience;
    private int level;
    private HashMap<String, ClanRank> ranks;
    private List<UUID> allies;
    private HashMap<Integer, ClanChest> chests;
    private TeleportPoint home;
    private List<String> mailboxItems;
    private UUID playerWithMailboxOpen;
    private BigDecimal balance;
    private HashMap<String, ClanSetting> settings;
    private HashMap<String, Object> shopData;
    private int kills;
    private int deaths;
    private UUID questWeekID;
    private Quest selectedQuest;
    private Set<QuestID> availableWeeklyQuests;
    private List<QuestID> completedWeeklyQuests;
    private List<QuestID> completedPermanentQuests;

    public Clan(UUID uuid, String name, UUID leader) {
        this.uuid = uuid;
        this.name = name;
        this.displayName = name;
        this.leader = leader;

        this.description = "";
        this.members = new HashMap<>();
        this.creationDate = LocalDateTime.now();
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

        this.availableWeeklyQuests = new HashSet<>();
        this.completedWeeklyQuests = new ArrayList<>();
        this.completedPermanentQuests = new ArrayList<>();
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

    public HashMap<UUID, ClanMember> getMembers() {
        return members;
    }

    public void setMembers(HashMap<UUID, ClanMember> members) {
        this.members = members;
    }
    public List<ClanMember> getOnlineMembers() {
        return members.values().stream().filter(ClanMember::isOnline).toList();
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
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

    public HashMap<Integer, ClanChest> getChests() {
        return chests;
    }

    public void setChests(HashMap<Integer, ClanChest> chests) {
        this.chests = chests;
    }

    public TeleportPoint getHome() {
        return home;
    }

    public void setHome(TeleportPoint home) {
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

    public UUID getQuestWeekID() {
        return questWeekID;
    }

    public void setQuestWeekID(UUID questWeekID) {
        this.questWeekID = questWeekID;
    }

    public Quest getSelectedQuest() {
        return selectedQuest;
    }

    public void setSelectedQuest(Quest selectedQuest) {
        this.selectedQuest = selectedQuest;
    }

    public Set<QuestID> getAvailableWeeklyQuests() {
        return availableWeeklyQuests;
    }

    public void setAvailableWeeklyQuests(Set<QuestID> availableWeeklyQuests) {
        this.availableWeeklyQuests = availableWeeklyQuests;
    }

    public List<QuestID> getCompletedWeeklyQuests() {
        return completedWeeklyQuests;
    }

    public void setCompletedWeeklyQuests(List<QuestID> completedWeeklyQuests) {
        this.completedWeeklyQuests = completedWeeklyQuests;
    }

    public List<QuestID> getCompletedPermanentQuests() {
        return completedPermanentQuests;
    }

    public void setCompletedPermanentQuests(List<QuestID> completedPermanentQuests) {
        this.completedPermanentQuests = completedPermanentQuests;
    }

    public void resetWeeklyQuests(UUID currentWeekID, int weeklyQuests, Set<String> weeklySections) {
        Set<QuestID> selectedQuests = new HashSet<>();
        while (selectedQuests.size() != weeklyQuests) {
            String section = weeklySections.stream().skip(new Random().nextInt(weeklySections.size())).findFirst().orElse(null);
            QuestID questID = new QuestID(QuestType.WEEKLY, section);
            selectedQuests.add(questID);
        }

        setQuestWeekID(currentWeekID);

        if (getSelectedQuest() != null && getSelectedQuest().getId().getType() == QuestType.WEEKLY) {
            setSelectedQuest(null);
        }

        setAvailableWeeklyQuests(selectedQuests);
        setCompletedWeeklyQuests(new ArrayList<>());
    }
}
