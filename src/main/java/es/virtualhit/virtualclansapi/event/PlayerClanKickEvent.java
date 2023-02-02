package es.virtualhit.virtualclansapi.event;

import es.virtualhit.virtualclansapi.clan.Clan;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class PlayerClanKickEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Clan clan;
    private final Player kicker;
    private final UUID kickedUUID;


    public PlayerClanKickEvent(@NotNull Clan clan, @NotNull Player kicker, @NotNull UUID kickedUUID) {
        this.clan = clan;
        this.kicker = kicker;
        this.kickedUUID = kickedUUID;
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

    public Player getKicker() {
        return kicker;
    }

    public UUID getKickedUUID() {
        return kickedUUID;
    }
}
