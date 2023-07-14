package es.virtualhit.virtualclansapi.clan.position;

import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.UUID;

public class Position extends Location {
    public Server server;

    public Position(double x, double y, double z, float yaw, float pitch, @NotNull World world, @NotNull Server server) {
        super(x, y, z, yaw, pitch, world);
        this.server = server;
    }

    public Position(@NotNull Location location, @NotNull Server server) {
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

    public static Optional<Position> parse(@NotNull String[] args, @NotNull Position relativeTo) {
        if (args.length >= 3 && args.length <= 5) {
            try {
                double x = parseCoordinate(args[0], relativeTo.x);
                double y = parseCoordinate(args[1], relativeTo.y);
                double z = parseCoordinate(args[2], relativeTo.z);
                World world = args.length > 3 ? new World(args[3], UUID.randomUUID()) : relativeTo.world;
                Server server = args.length > 4 ? new Server(args[4]) : relativeTo.server;
                return Optional.of(new Position(x, y, z, relativeTo.yaw, relativeTo.pitch, world, server));
            } catch (NumberFormatException var10) {
                return Optional.empty();
            }
        } else {
            return Optional.empty();
        }
    }

    private static double parseCoordinate(@NotNull String value, double currentValue) throws NumberFormatException {
        if (value.startsWith("~")) {
            return value.length() == 1 ? currentValue : currentValue + Double.parseDouble(value.substring(1));
        } else {
            return Double.parseDouble(value);
        }
    }
}
