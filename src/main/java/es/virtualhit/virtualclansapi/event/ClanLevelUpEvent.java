package es.virtualhit.virtualclansapi.event;

import es.virtualhit.virtualclansapi.clan.Clan;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ClanLevelUpEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Clan clan;

    public ClanLevelUpEvent(@NotNull Clan clan) {
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
