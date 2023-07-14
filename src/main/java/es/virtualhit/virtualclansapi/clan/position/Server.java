package es.virtualhit.virtualclansapi.clan.position;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Server {
    public String name;

    public Server(@Nullable String name) {
        this.name = name != null ? name : "server";
    }

    public Server() {
    }

    public boolean equals(@NotNull Object other) {
        if (other instanceof Server server) {
            return server.name.equalsIgnoreCase(this.name);
        } else {
            return super.equals(other);
        }
    }
}
