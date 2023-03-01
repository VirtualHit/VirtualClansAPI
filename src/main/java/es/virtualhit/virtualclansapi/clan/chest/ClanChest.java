package es.virtualhit.virtualclansapi.clan.chest;

import es.virtualhit.virtualclansapi.serializer.BukkitSerializer;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ClanChest {

    private List<String> items;
    private UUID playerWithChestOpen;

    public ClanChest() {
        this.items = new ArrayList<>();
    }

    public List<ItemStack> getItems() {
        return BukkitSerializer.fromBase64(items);
    }

    public void setItems(List<ItemStack> items) {
        this.items = BukkitSerializer.toBase64(items);
    }

    public UUID getPlayerWithChestOpen() {
        return playerWithChestOpen;
    }

    public void setPlayerWithChestOpen(UUID playerWithChestOpen) {
        this.playerWithChestOpen = playerWithChestOpen;
    }
}
