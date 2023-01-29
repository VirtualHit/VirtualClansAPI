package es.virtualhit.virtualclansapi.clan;

import es.virtualhit.virtualclansapi.service.UpdateType;
import es.virtualhit.virtualclansapi.user.User;

import java.util.UUID;

public interface ClanService {

    void create(Clan clan);
    void update(Clan clan, UpdateType updateType);
    boolean exists(UUID uuid);
    User get(UUID uuid);
    void loadToRedis(Clan clan);
    void unloadFromRedis(UUID uuid);


}
