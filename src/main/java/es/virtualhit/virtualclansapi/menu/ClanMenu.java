package es.virtualhit.virtualclansapi.menu;

import es.virtualhit.virtualmenu.event.PlayerClickMenuItemEvent;
import org.bukkit.entity.Player;

public abstract class ClanMenu {

    public abstract void open(Player player);

    public abstract void executeActions(PlayerClickMenuItemEvent event);
}
