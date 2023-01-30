package es.virtualhit.virtualclansapi.invite;

public interface InviteService {

    void create(Invite invite);
    Invite get(String id);
    void delete(String id);
    boolean exists(String id);
}
