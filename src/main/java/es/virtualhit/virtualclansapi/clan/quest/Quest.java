package es.virtualhit.virtualclansapi.clan.quest;

import es.virtualhit.virtualclansapi.clan.quest.requirement.QuestRequirement;

import java.util.List;

public class Quest {

    private final QuestID id;
    private String name;
    private List<QuestRequirement> requirements;

    public Quest(QuestID id, String name, List<QuestRequirement> requirements) {
        this.id = id;
        this.name = name;
        this.requirements = requirements;
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
        for (QuestRequirement requirement : requirements) {
            if (!requirement.isCompleted()) return false;
        }

        return true;
    }

    public double getPercentageCompleted() {
        double completed = 0;
        for (QuestRequirement requirement : requirements) {
            completed += requirement.getPercentageCompleted();
        }

        return completed / requirements.size();
    }
}
