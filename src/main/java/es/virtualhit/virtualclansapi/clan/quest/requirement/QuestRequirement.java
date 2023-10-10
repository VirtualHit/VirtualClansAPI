package es.virtualhit.virtualclansapi.clan.quest.requirement;

import java.util.HashMap;

public class QuestRequirement {

    private final QuestRequirementType type;
    private final double requiredAmount;
    private final HashMap<String, String> data;
    private double currentAmount;

    public QuestRequirement(QuestRequirementType type, double requiredAmount, HashMap<String, String> data) {
        this.type = type;
        this.requiredAmount = requiredAmount;
        this.currentAmount = 0;
        this.data = data;
    }

    public QuestRequirementType getType() {
        return type;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public boolean isCompleted() {
        return currentAmount >= requiredAmount;
    }

    public HashMap<String, String> getData() {
        return data;
    }
}
