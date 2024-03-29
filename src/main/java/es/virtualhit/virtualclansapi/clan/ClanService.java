package es.virtualhit.virtualclansapi.clan;

import es.virtualhit.virtualclansapi.service.UpdateType;

import java.util.List;
import java.util.UUID;

public interface ClanService {

    void create(Clan clan);
    void delete(UUID uuid);

    void update(Clan clan, UpdateType updateType);

    boolean exists(UUID uuid);
    boolean exists(String name);

    Clan get(UUID uuid);
    Clan get(String name);

    void loadToRedis(Clan clan);

    void unloadFromRedis(UUID uuid);

    boolean isLoadedInRedis(UUID uuid);

    List<Clan> getByExperience(int from, int to);

    List<Clan> getAllFromRedis();
}
