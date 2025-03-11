package com.EventsLuck.service;


import java.util.Random;

public class LuckDeciphering {

    // Array of lucky objects for a college student
    private static final String[] LUCKY_OBJECTS = {
        "Notebook", "Pen", "Laptop", "Coffee Mug", "Textbook", "Calculator", 
        "Water Bottle", "Backpack", "Headphones", "Sticky Notes", 
        "Highlighters", "USB Drive", "Snack Bar", "Eraser", "Ruler", 
        "Planner", "Phone Charger", "Sunglasses", "Wallet", "Keychain"
    };

    // Array of lucky colors
    public static final String[] LUCKY_COLORS = {
        "Red", "Blue", "Green", "Yellow", "Purple", "Orange", "Pink", "Black", "White", "Gold"
    };

    private Random random;

    public LuckDeciphering() {
        this.random = new Random();
    }

    /**
     * Get the lucky object for the day.
     *
     * @return A randomly selected lucky object.
     */
    public String getLuckyObject() {
        String luckyObject = LUCKY_OBJECTS[random.nextInt(LUCKY_OBJECTS.length)];
        System.out.println("Your lucky object for the day is: " + luckyObject); // Print statement
        return luckyObject;
    }

    /**
     * Get the lucky color for the day.
     *
     * @return A randomly selected lucky color.
     */
    public String getLuckyColor() {
        String luckyColor = LUCKY_COLORS[random.nextInt(LUCKY_COLORS.length)];
        System.out.println("Your lucky color for the day is: " + luckyColor); // Print statement
        return luckyColor;
    }

    /**
     * Getter method for LUCKY_OBJECTS array.
     *
     * @return The array of lucky objects.
     */
    public static String[] getLuckyObjects() {
        return LUCKY_OBJECTS;
    }
}