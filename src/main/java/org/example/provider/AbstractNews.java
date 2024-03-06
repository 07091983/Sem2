package org.example.provider;

import org.example.Subscriber.Subscriber;

public abstract class AbstractNews implements Newspaper {
    @Override
    public void subscription(Subscriber subscriber) {

    }

    @Override
    public void notification(String news) {

    }

    @Override
    public void unsubscribe(Subscriber subscriber) {

    }
}
