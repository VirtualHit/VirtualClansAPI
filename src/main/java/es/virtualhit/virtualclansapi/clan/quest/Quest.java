package es.virtualhit.virtualclansapi.clan.quest;

import es.virtualhit.virtualclansapi.clan.quest.requirement.QuestRequirement;

import java.util.List;

public class Quest {

    private final QuestID id;
    private String name;
    private List<QuestRequirement> requirements;
    private boolean completed;

    public Quest(QuestID id, String name, List<QuestRequirement> requirements) {
        this.id = id;
        this.name = name;
        this.requirements = requirements;
        this.completed = false;
    }

    public QuestID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<QuestRequirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<QuestRequirement> requirements) {
        this.requirements = requirements;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean requirementsCompleted() {
        for (QuestRequirement requirement : requirements) {
            if (!requirement.isCompleted()) return false;
        }
        return true;
    }
}
