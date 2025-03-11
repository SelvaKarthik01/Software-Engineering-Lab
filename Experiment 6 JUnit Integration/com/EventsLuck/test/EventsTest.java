package com.EventsLuck.test;


import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.EventsLuck.service.Events;

class EventsTest {

    private Events event;

    @BeforeEach
    void setUp() {
        // Create a new event with a name, date, and time
        event = new Events("Study Session", "2023-10-15", "10:00 AM");
    }

    @Test
    void testEventCreation() {
        // Test if the event is created with the correct details
        assertNotNull(event);
        assertEquals("Study Session", event.getEventName());
        assertEquals("2023-10-15", event.getEventDate());
        assertEquals("10:00 AM", event.getEventTime());
    }

    @Test
    void testLuckyObjectAssignment() {
        // Test if a lucky object is assigned to the event
        String luckyObject = event.getLuckyObject();
        assertNotNull(luckyObject);
        assertTrue(luckyObject.length() > 0);
        System.out.println("Lucky Object for the event: " + luckyObject);
    }

    @Test
    void testLuckyColorAssignment() {
        // Test if a lucky color is assigned to the event
        String luckyColor = event.getLuckyColor();
        assertNotNull(luckyColor);
        assertTrue(luckyColor.length() > 0);
        System.out.println("Lucky Color for the event: " + luckyColor);
    }

    @Test
    void testToString() {
        // Test the toString method to ensure it includes event details and lucky attributes
        String eventString = event.toString();
        assertTrue(eventString.contains("Study Session"));
        assertTrue(eventString.contains("2023-10-15"));
        assertTrue(eventString.contains("10:00 AM"));
        assertTrue(eventString.contains("Lucky Object"));
        assertTrue(eventString.contains("Lucky Color"));
        System.out.println("Event Details:\n" + eventString);
    }
}