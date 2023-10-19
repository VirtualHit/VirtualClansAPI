package es.virtualhit.virtualclansapi.event;

import es.virtualhit.virtualclansapi.clan.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

public class ClanProgressQuestEvent extends PlayerEvent {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Clan clan;

    public ClanProgressQuestEvent(@NotNull Player who, @NotNull Clan clan) {
        super(who);
        this.clan = clan;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public @NotNull Clan getClan() {
        return clan;
    }
}
