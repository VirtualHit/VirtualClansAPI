package es.virtualhit.virtualclansapi.quest;

import es.virtualhit.virtualclansapi.service.UpdateType;

import java.util.List;

public interface QuestService {

    void create(Quest quest);
    void delete(String id);
    void update(Quest quest, UpdateType updateType);
    List<Quest> getEnabledQuests();
    List<Quest> getAllQuests();
}
