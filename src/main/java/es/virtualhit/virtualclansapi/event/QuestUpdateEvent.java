package es.virtualhit.virtualclansapi.event;

import es.virtualhit.virtualclansapi.quest.type.QuestType;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class QuestUpdateEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private QuestType questType;

    public QuestUpdateEvent(QuestType questType) {
        this.questType = questType;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}