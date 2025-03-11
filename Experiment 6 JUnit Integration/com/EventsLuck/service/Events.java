package com.EventsLuck.service;

public class Events {

    private String eventName;
    private String eventDate;
    private String eventTime;
    private String luckyObject; // Lucky object for the event
    private String luckyColor;  // Lucky color for the event

    private LuckDeciphering luckDeciphering;

    public Events(String eventName, String eventDate, String eventTime) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.luckDeciphering = new LuckDeciphering();
        this.luckyObject = luckDeciphering.getLuckyObject(); // Assign a lucky object
        this.luckyColor = luckDeciphering.getLuckyColor();   // Assign a lucky color
    }

    // Getters for event details
    public String getEventName() {
        return eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    // Getters for lucky object and color
    public String getLuckyObject() {
        return luckyObject;
    }

    public String getLuckyColor() {
        return luckyColor;
    }

    @Override
    public String toString() {
        return "Event: " + eventName + 
               "\nDate: " + eventDate + 
               "\nTime: " + eventTime + 
               "\nLucky Object: " + luckyObject + 
               "\nLucky Color: " + luckyColor;
    }
}