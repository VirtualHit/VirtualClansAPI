package es.virtualhit.virtualclansapi.clan.quest;

public class QuestID {

    private final QuestType type;
    private final String id;

    public QuestID(QuestType type, String id) {
        this.type = type;
        this.id = id;
    }

    public QuestID(String questID) {
        String[] split = questID.split("-_-");
        this.type = QuestType.valueOf(split[0]);
        this.id = split[1];
    }

    public QuestType getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return type.toString() + "-_-" + id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof QuestID questID) {
            return questID.getType().equals(this.getType()) && questID.getId().equals(this.getId());
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}
