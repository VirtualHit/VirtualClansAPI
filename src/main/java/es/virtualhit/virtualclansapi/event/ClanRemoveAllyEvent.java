package es.virtualhit.virtualclansapi.event;

import es.virtualhit.virtualclansapi.clan.Clan;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ClanRemoveAllyEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Clan firstClan;
    private final Clan secondClan;

    public ClanRemoveAllyEvent(@NotNull Clan firstClan, @NotNull Clan secondClan) {
        this.firstClan = firstClan;
        this.secondClan = secondClan;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Clan getFirstClan() {
        return firstClan;
    }

    public Clan getSecondClan() {
        return secondClan;
    }
}
