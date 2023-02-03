package es.virtualhit.virtualclansapi.event;

import es.virtualhit.virtualclansapi.clan.Clan;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ClanRequestAllyEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Clan toClan;
    private final Clan fromClan;

    public ClanRequestAllyEvent(@NotNull Clan toClan, @NotNull Clan fromClan) {
        this.toClan = toClan;
        this.fromClan = fromClan;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Clan getToClan() {
        return toClan;
    }

    public Clan getFromClan() {
        return fromClan;
    }
}
