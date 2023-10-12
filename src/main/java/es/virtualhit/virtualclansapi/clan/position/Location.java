package es.virtualhit.virtualclansapi.clan.position;

import org.jetbrains.annotations.NotNull;

public class Location {
    public double x;
    public double y;
    public double z;
    public float yaw;
    public float pitch;
    public World world;

    public Location(double x, double y, double z, @NotNull World world) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = 0.0F;
        this.pitch = 0.0F;
        this.world = world;
    }

    public Location(double x, double y, double z, float yaw, float pitch, @NotNull World world) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.yaw = yaw;
        this.pitch = pitch;
        this.world = world;
    }

    public Location() {
    }
}
