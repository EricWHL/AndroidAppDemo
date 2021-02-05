package com.example.androidappdemo.Utils;

public class MessageEvent {
    public final int eventId;
    public final String message;

    public MessageEvent(int id ,String message) {
        this.eventId = id;
        this.message = message;
    }

    public int getEventId() {
        return eventId;
    }

    public String getMessage() {
        return message;
    }
}
