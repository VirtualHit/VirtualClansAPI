package es.virtualhit.virtualclansapi.clan.quest.reward;

import es.virtualhit.virtualclansapi.clan.Clan;
import org.bukkit.inventory.ItemStack;

public class QuestReward {

    private final String ID;
    private final RewardType type;
    private int experienceAmount;
    private ItemStack item;

    public QuestReward(String ID, RewardType type, int experienceAmount, ItemStack item) {
        this.ID = ID;
        this.type = type;
        this.experienceAmount = experienceAmount;
        this.item = item;
    }

    public String getID() {
        return ID;
    }

    public RewardType getType() {
        return type;
    }

    public double getExperienceAmount() {
        return experienceAmount;
    }

    public void setExperienceAmount(int experienceAmount) {
        this.experienceAmount = experienceAmount;
    }

    public ItemStack getItem() {
        return item;
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }

    public void giveReward(Clan clan) {
        switch (type) {
            case CLAN_EXPERIENCE -> clan.setExperience(clan.getExperience() + experienceAmount);
            case ITEM -> clan.getMailboxItems().add(item);
        }
    }

    public enum RewardType {
        CLAN_EXPERIENCE,
        ITEM
    }
}
