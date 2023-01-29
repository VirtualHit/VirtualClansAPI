package es.virtualhit.virtualclansapi.user;

import java.util.UUID;

public interface UserService {

    void create(User user);
    void update(User user);
    boolean exists(User user);
    User get(UUID uuid);
    User get(String name);
    void loadToRedis(User user);
    void unloadFromRedis(UUID uuid);
}
