package es.virtualhit.virtualclansapi.quest;

import es.virtualhit.virtualclansapi.quest.reward.QuestReward;
import es.virtualhit.virtualclansapi.quest.type.QuestType;

import java.util.ArrayList;
import java.util.List;

public class Quest {

    private String id;
    private String name;
    private String description;
    private QuestType type;
    private List<QuestReward> rewards;

    public Quest(String id, String name, String description, QuestType type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.rewards = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QuestType getType() {
        return type;
    }

    public void setType(QuestType type) {
        this.type = type;
    }

    public List<QuestReward> getRewards() {
        return rewards;
    }

    public void setRewards(List<QuestReward> rewards) {
        this.rewards = rewards;
    }
}
