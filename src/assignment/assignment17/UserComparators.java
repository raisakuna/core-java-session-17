package assignment.assignment17;

import java.util.*;

import java.util.Comparator;

// Interface to define user comparators
public interface UserComparators extends Comparator<User> {
    // Comparator to sort by name
    static Comparator<User> byName() {
        return  (user1, user2) -> user1.getName().compareTo(user2.getName());
    }

    // Comparator to sort by age
    static Comparator<User> byAge() {
        return Comparator.comparing(User::getAge);
    }
}
