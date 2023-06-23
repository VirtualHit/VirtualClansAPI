package es.virtualhit.virtualclansapi.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class QuestUpdateEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private UpdateType updateType;

    public QuestUpdateEvent(UpdateType updateType) {
        this.updateType = updateType;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public enum UpdateType {
        DAILY,
        WEEKLY
    }
}