package es.virtualhit.virtualclansapi.event;

import es.virtualhit.virtualclansapi.clan.Clan;
import es.virtualhit.virtualclansapi.clan.quest.QuestID;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

public class ClanEndQuestEvent extends PlayerEvent {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Clan clan;
    private final QuestID questID;
    private final QuestEndReason reason;

    public ClanEndQuestEvent(boolean async, @NotNull Player who, @NotNull Clan clan, @NotNull QuestID questID, @NotNull QuestEndReason reason) {
        super(who, async);
        this.clan = clan;
        this.questID = questID;
        this.reason = reason;
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

    public @NotNull QuestID getQuestID() {
        return questID;
    }

    public @NotNull QuestEndReason getReason() {
        return reason;
    }

    public enum QuestEndReason {
        QUEST_COMPLETED,
        QUEST_CANCELLED
    }
}
