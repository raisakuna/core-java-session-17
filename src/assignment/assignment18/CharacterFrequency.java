package assignment.assignment18;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "aaaabbbbcaaacceffffeedddddffffffff";

        // Create a map to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Calculate character frequencies
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Print character frequencies
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Find character with highest frequency
        char maxChar = '\0';
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        // Print character with highest frequency
        System.out.println("Character with highest frequency: " + maxChar + ", Frequency: " + maxFrequency);
    }

}
