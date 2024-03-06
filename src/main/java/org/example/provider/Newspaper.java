package org.example.provider;

import org.example.Subscriber.Subscriber;

public interface Newspaper {

    void subscription(Subscriber subscriber);
    void notification(String news);
    void unsubscribe(Subscriber subscriber);
}
