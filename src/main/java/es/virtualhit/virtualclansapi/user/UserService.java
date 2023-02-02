package es.virtualhit.virtualclansapi.user;

import es.virtualhit.virtualclansapi.service.UpdateType;

import java.util.UUID;

public interface UserService {

    void create(User user);
    void update(User user, UpdateType updateType);
    boolean exists(UUID uuid);
    boolean exists(String name);
    User get(UUID uuid);
    User get(String name);
    String getName(UUID uuid);
    void loadToRedis(User user);
    void unloadFromRedis(UUID uuid);
}
