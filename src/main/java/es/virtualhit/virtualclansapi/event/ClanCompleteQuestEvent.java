package es.virtualhit.virtualclansapi.event;

import es.virtualhit.virtualclansapi.clan.Clan;
import es.virtualhit.virtualclansapi.quest.Quest;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ClanCompleteQuestEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Clan clan;
    private final Quest quest;

    public ClanCompleteQuestEvent(@NotNull Clan clan, @NotNull Quest quest) {
        this.clan = clan;
        this.quest = quest;
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

    public @NotNull Quest getQuest() {
        return quest;
    }
}
