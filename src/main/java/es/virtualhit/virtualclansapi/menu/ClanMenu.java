package es.virtualhit.virtualclansapi.menu;

import es.virtualhit.virtualmenu.event.PlayerClickMenuItemEvent;
import org.bukkit.entity.Player;

public abstract class ClanMenu {

    abstract void open(Player player);

    abstract void executeActions(PlayerClickMenuItemEvent event);
}
