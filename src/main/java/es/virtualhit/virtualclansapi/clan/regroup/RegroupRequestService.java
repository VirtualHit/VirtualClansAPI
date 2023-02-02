package es.virtualhit.virtualclansapi.clan.regroup;

import java.util.UUID;

public interface RegroupRequestService {

    void create(RegroupRequest regroupRequest);
    RegroupRequest get(UUID clanUUID);
    void delete(UUID clanUUID);
    boolean exists(UUID clanUUID);
}
