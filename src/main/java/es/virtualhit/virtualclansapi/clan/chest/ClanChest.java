package es.virtualhit.virtualclansapi.clan.chest;

import org.bukkit.inventory.Inventory;

import java.util.UUID;

public class ClanChest {

    private Inventory inventory;
    private UUID playerWithChestOpen;

    public ClanChest(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public UUID getPlayerWithChestOpen() {
        return playerWithChestOpen;
    }

    public void setPlayerWithChestOpen(UUID playerWithChestOpen) {
        this.playerWithChestOpen = playerWithChestOpen;
    }
}
