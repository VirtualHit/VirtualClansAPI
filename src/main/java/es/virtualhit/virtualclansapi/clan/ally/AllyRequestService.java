package es.virtualhit.virtualclansapi.clan.ally;

public interface AllyRequestService {

    void create(AllyRequest request);

    AllyRequest get(String id);

    void delete(String id);

    boolean exists(String id);
}
