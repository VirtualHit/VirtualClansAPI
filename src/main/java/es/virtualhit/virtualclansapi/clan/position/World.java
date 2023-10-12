package es.virtualhit.virtualclansapi.clan.position;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class World {

    public String name;
    public UUID uuid;
    public @Nullable Environment environment;

    public World(@NotNull String name, @NotNull UUID uuid) {
        this.name = name;
        this.uuid = uuid;
    }

    public World(@NotNull String name, @NotNull UUID uuid, @Nullable Environment environment) {
        this.name = name;
        this.uuid = uuid;
        this.environment = environment;
    }

    public World() {
    }

    public boolean equals(@NotNull Object obj) {
        if (obj instanceof World world) {
            return world.uuid.equals(this.uuid);
        } else {
            return super.equals(obj);
        }
    }

    public static enum Environment {
        OVERWORLD,
        NETHER,
        THE_END,
        CUSTOM;

        private Environment() {
        }
    }
}
