package es.virtualhit.virtualclansapi.serializer;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.util.io.BukkitObjectInputStream;
import org.bukkit.util.io.BukkitObjectOutputStream;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class BukkitSerializer {

    public static String toBase64(ItemStack item) {
        return Base64.getEncoder().encodeToString(item.serializeAsBytes());
    }

    public static ItemStack fromBase64(String base64) {
        return ItemStack.deserializeBytes(Base64.getDecoder().decode(base64));
    }

    public static List<String> toBase64(List<ItemStack> items) {
        List<String> base64 = new ArrayList<>();
        for (ItemStack item : items) {
            base64.add(toBase64(item));
        }

        return base64;
    }

    public static List<ItemStack> fromBase64(List<String> base64) {
        List<ItemStack> items = new ArrayList<>();
        for (String item : base64) {
            items.add(fromBase64(item));
        }

        return items;
    }
}
