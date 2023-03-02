package es.virtualhit.virtualclansapi.quest.reward;

import es.virtualhit.virtualclansapi.serializer.BukkitSerializer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class QuestReward {

    private String itemBase64;
    private String command;
    private RewardType type;

    public QuestReward(ItemStack itemStack, String command, RewardType type) {
        this.itemBase64 = toBase64(itemStack);
        this.command = command;
        this.type = type;
    }

    public ItemStack getItemStack() {
        return fromBase64(itemBase64);
    }

    public String getCommand() {
        return command;
    }

    public RewardType getType() {
        return type;
    }

    public void give(Player player) {
        if (type == RewardType.ITEM) {
            player.getInventory().addItem(fromBase64(itemBase64));
        } else {
            String playerCommand = command;
            if (command.contains("%player%")) {
                playerCommand = command.replace("%player%", player.getName());
            }

            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), playerCommand);
        }
    }

    public enum RewardType {
        ITEM,
        COMMAND
    }

    private String toBase64(ItemStack item) {
        return BukkitSerializer.toBase64(item);
    }

    private ItemStack fromBase64(String base64) {
        return BukkitSerializer.fromBase64(base64);
    }
}