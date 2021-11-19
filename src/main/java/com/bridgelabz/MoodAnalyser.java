package com.bridgelabz;

/**
 * Purpose  - I am in Any Mood” message Should Return Happy
 * @author  - Rahul Gupta
 * @version - 16.0
 * @since   - 2021-11-09
 */

public class MoodAnalyser {
    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("Any")) {
        }
        return "Happy";
    }
}
