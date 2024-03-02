package immutableClass;


import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
            private final int intValue;
            private final String stringValue;
            private final List<String> stringList;

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
        }



