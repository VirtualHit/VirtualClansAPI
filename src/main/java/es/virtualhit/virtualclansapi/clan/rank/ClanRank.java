package es.virtualhit.virtualclansapi.clan.rank;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ClanRank {
    private String name;
    private int weight;
    private List<ClanPermission> permissions;
    private final boolean maxRank;

    public ClanRank(String name, int weight, boolean maxRank) {
        this.name = name;
        this.weight = weight;
        this.permissions = new ArrayList<>();
        this.maxRank = maxRank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<ClanPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<ClanPermission> permissions) {
        this.permissions = permissions;
    }

    public boolean isMaxRank() {
        return maxRank;
    }
}
