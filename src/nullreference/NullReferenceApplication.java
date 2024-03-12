package nullreference;

import java.time.LocalDate;
import java.util.Objects;

public class NullReferenceApplication {

    public static void main(String[] args) {
        Category international = new Category();
        //international.setCreatedAt("2023-03-24");
        //System.out.println(international.getCreatedAt());

        // exit code 1, error with null pointer exception because getCreatedAt() holds some value, but it is null.
        // In order to handle such exception either  we have to put the value of createdAt() in Category
        // or, we can check if that value is not null or not

        /*LocalDate createdDate = LocalDate.parse(international.getCreatedAt());
        System.out.println(createdDate);
        createdDate.plusDays(6);

        System.out.println("This value won't get changed, because LocalDate is an immutable class");
        System.out.println(createdDate);*/

        /*System.out.println("To get change the value, we have to create another object");
        LocalDate newDate = createdDate.plusDays(6);
        System.out.println(newDate);*/


        // Before running the program check if the value is null or not
        boolean isCreatedAtNull =  international.getCreatedAt() == null;
        System.out.println(isCreatedAtNull);

        // isCreatedAtNull == false
        if(!isCreatedAtNull ){
            LocalDate isCreatedAtNullOrNot = LocalDate.parse(international.getCreatedAt());
            isCreatedAtNullOrNot.plusDays(6);
        }
        System.out.println(isCreatedAtNull);

        // We can check if the value is null or not by using Objects (Utility class)
        boolean isCreatedAtNullObjects = Objects.isNull(international.getCreatedAt());
        System.out.println(isCreatedAtNullObjects);

        // isCreatedAtNullObjects == false, if the value is null then it will return true
        if(!isCreatedAtNullObjects ){
            LocalDate isCreatedAtNullOrNot = LocalDate.parse(international.getCreatedAt());
            isCreatedAtNullOrNot.plusDays(6);
        }
        System.out.println(isCreatedAtNullObjects);


        // Objects.requireNonNullElse(T obj, T defaultObj)
        LocalDate notNullOrDefault = LocalDate.parse(Objects.requireNonNullElse(international.getCreatedAt(), "2024-02-29"));
        System.out.println(notNullOrDefault);

        // or, we can write some logic in our getter(), example
        /*
        public String getCreatedAt() {
        return Objects.requireNonNullElse(createdAt,"2024-02-29");
    }
         */

        /**
         * Implicit and Explicit Parameter
         * public void setCategoryId(int id) {
         *         this.id = id;
         *         this => international, which is implicit parameter, whereas (1) is explicit one
         *     }
         *
         *
         * Category international = new Category();
         * international.setCategoryId(1);
         * Here, international is also getting value
         *
         */


    }
}
