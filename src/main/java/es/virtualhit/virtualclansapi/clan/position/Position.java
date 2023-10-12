package es.virtualhit.virtualclansapi.clan.position;

import org.jetbrains.annotations.NotNull;

public class Position extends Location {
    public String server;

    public Position(double x, double y, double z, float yaw, float pitch, @NotNull World world, @NotNull String server) {
        super(x, y, z, yaw, pitch, world);
        this.server = server;
    }

    public Position(@NotNull Location location, @NotNull String server) {
        super(location.x, location.y, location.z, location.yaw, location.pitch, location.world);
        this.server = server;
    }

    public Position() {
    }

    public void update(@NotNull Position newPosition) {
        this.x = newPosition.x;
        this.y = newPosition.y;
        this.z = newPosition.z;
        this.yaw = newPosition.yaw;
        this.pitch = newPosition.pitch;
        this.world = newPosition.world;
        this.server = newPosition.server;
    }
}
