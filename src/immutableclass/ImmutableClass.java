package immutableclass;


import java.util.ArrayList;
import java.util.List;

//  Declare the class as final, so it can't be extended by other class.
public final class ImmutableClass {

    // Make all the fields of the class private so that direct access to the data member is not allowed.
    // Make all the fields of the class final so that it's value don't get changed after the object creation
            private final int intValue;
            private final String stringValue;
            private final List<String> stringList;
// A parameterized constructor should initialize all the fields performing a
// deep copy so that data member can't be modified with an object reference.
            public ImmutableClass(int intValue, String stringValue, List<String> stringList) {
                this.intValue = intValue;
                this.stringValue = stringValue;
                // Deep copy for the mutable field to maintain immutability
                this.stringList = new ArrayList<>(stringList);
            }

            public int getIntValue() {
                return intValue;
            }

            public String getStringValue() {
                return stringValue;
            }

            // No setter methods to modify the state of the object

            public List<String> getStringList() {
                // Return a copy of the list to avoid modification of internal state
                return new ArrayList<>(stringList);
            }

            // Optional: Implement other methods as needed, ensuring they don't modify internal state

            @Override
            public String toString() {
                return "ImmutableClass{" +
                        "intValue=" + intValue +
                        ", stringValue='" + stringValue + '\'' +
                        ", stringList=" + stringList +
                        '}';
            }

            // Avoid providing setter methods to modify the state of the object after creation.
    //No Setter
        }



