package com.EventsLuck.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.EventsLuck.service.LuckDeciphering;

public class LuckDecipheringTest {

    private LuckDeciphering luckDeciphering;

    @BeforeEach
    void setUp() {
        luckDeciphering = new LuckDeciphering();
    }

    @Test
    void testGetLuckyObject() {
        System.out.println("=== Testing getLuckyObject() ===");
        String luckyObject = luckDeciphering.getLuckyObject();
        assertNotNull(luckyObject);
        assertTrue(luckyObject.length() > 0);
        System.out.println("Test passed: Lucky object is valid.\n");
    }

    @Test
    void testGetLuckyColor() {
        System.out.println("=== Testing getLuckyColor() ===");
        String luckyColor = luckDeciphering.getLuckyColor();
        assertNotNull(luckyColor);
        assertTrue(luckyColor.length() > 0);
        System.out.println("Test passed: Lucky color is valid.\n");
    }

    @Test
    void testLuckyObjectInList() {
        System.out.println("=== Testing testLuckyObjectInList() ===");
        String luckyObject = luckDeciphering.getLuckyObject();
        String[] luckyObjects = LuckDeciphering.getLuckyObjects();
        assertTrue(luckyObjects.length > 0);
        assertTrue(java.util.Arrays.asList(luckyObjects).contains(luckyObject));
        System.out.println("Test passed: Lucky object is in the list.\n");
    }

    @Test
    void testLuckyColorInList() {
        System.out.println("=== Testing testLuckyColorInList() ===");
        String luckyColor = luckDeciphering.getLuckyColor();
        assertTrue(LuckDeciphering.LUCKY_COLORS.length > 0);
        assertTrue(java.util.Arrays.asList(LuckDeciphering.LUCKY_COLORS).contains(luckyColor));
        System.out.println("Test passed: Lucky color is in the list.\n");
    }
}