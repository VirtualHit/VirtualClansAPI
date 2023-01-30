package es.virtualhit.virtualclansapi.messenger;

import es.virtualhit.virtualclansapi.messenger.message.Message;

public interface Messenger {

    void publish(Message message);
}
