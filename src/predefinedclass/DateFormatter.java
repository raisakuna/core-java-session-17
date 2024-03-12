package predefinedclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatter {
    public static String convertToEEEddMMM(String time) {
        // Define input date formats
        String[] inputFormats = {"yyyy-MM-dd", "MM-dd-yyyy", "yyyy/MM/dd"};
       // String  inputFormat ="yyyy-MM-dd";
        // Define output date format
        String outputFormat = "EEE dd MMM";
        //Date date2= inputFormat

        for (String inputFormat : inputFormats) {
            DateFormat inputFormatter = new SimpleDateFormat(inputFormat, Locale.ENGLISH);
            try {
                // Parse the input date
                Date date = inputFormatter.parse(time);
                // Format the parsed date to the desired output format
                DateFormat outputFormatter = new SimpleDateFormat(outputFormat, Locale.ENGLISH);
                return outputFormatter.format(date);
            } catch (ParseException e) {
                // If parsing fails, continue to the next format
                continue;
            }
        }
        // Return null if all parsing fails
        return null;
    }

    public static void main(String[] args) {
        String time1 = "2024-02-28";
        String time2 = "02-28-2024";
        String time3 = "2024/02/28";

        System.out.println("Date1: " + convertToEEEddMMM(time1));
        System.out.println("Date2: " + convertToEEEddMMM(time2));
        System.out.println("Date3: " + convertToEEEddMMM(time3));
        System.out.println("Date " + convertToEEEddMMM(time1));
    }

}
