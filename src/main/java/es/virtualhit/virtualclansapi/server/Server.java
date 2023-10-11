package es.virtualhit.virtualclansapi.server;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.util.UUID;

public class Server {

    @SerializedName("_id")
    private final String id;
    private UUID weekId;
    private LocalDateTime lastReset;

    public Server(UUID weekId, LocalDateTime lastReset) {
        this.id = "server";
        this.weekId = weekId;
        this.lastReset = lastReset;
    }

    public String getId() {
        return id;
    }

    public UUID getWeekId() {
        return weekId;
    }

    public void setWeekId(UUID weekId) {
        this.weekId = weekId;
    }

    public LocalDateTime getLastReset() {
        return lastReset;
    }

    public void setLastReset(LocalDateTime lastReset) {
        this.lastReset = lastReset;
    }

    public void resetWeek() {
        this.weekId = UUID.randomUUID();
        this.lastReset = LocalDateTime.now();
    }
}
