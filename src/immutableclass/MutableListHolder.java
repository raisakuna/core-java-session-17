package immutableclass;

import java.util.ArrayList;
import java.util.List;

public class MutableListHolder {
    private final List<String> items;

    public MutableListHolder(List<String> items) {
        this.items = new ArrayList<>(items); // Create a copy of the list to prevent external modifications
    }

   /* public List<String> getItems() {   // generate getter
        return items;
    }*/

    // Safe getter that returns a copy of the list
    public List<String> getItemsSafe() {
        return new ArrayList<>(items); // Return a copy to prevent changes to the original list
    }
}

// Main class should be a separate top-level class
class Main {
    public static void main(String[] args) {
        // Create a list of favorite fruits
        List<String> favoriteFruits = new ArrayList<>();
        favoriteFruits.add("Apple");
        favoriteFruits.add("Banana");
        favoriteFruits.add("Cherry");

        // Create an instance of MutableListHolder with the favorite fruits
        MutableListHolder fruitsHolder = new MutableListHolder(favoriteFruits);

        // Get the favorite fruits (safe copy)
        List<String> fruitsFromHolder = fruitsHolder.getItemsSafe();

        // Attempt to modify the returned list
        fruitsFromHolder.add("Date"); // This adds "Date" to the copy, not the original list

        // Print the original list and the modified copy
        System.out.println("Original list of favorite fruits: " + fruitsHolder.getItemsSafe()); // Output: [Apple, Banana, Cherry]
        System.out.println("Modified list of favorite fruits: " + fruitsFromHolder); // Output: [Apple, Banana, Cherry, Date]
    }
}
