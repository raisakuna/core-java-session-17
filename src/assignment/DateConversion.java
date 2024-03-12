package assignment;

import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateConversion {

    public static String convertToEEEddMMM(String time) throws ParseException {
        // Define input date formats
        String inputFormat1 = "yyyy-MM-dd";
        String inputFormat2 = "yyyy-dd-mm";
        String inputFormat3 = "yyyy/mm/dd";
        // Define output date format
        String outputFormat = "EEE dd MMM";
        //Date date2= inputFormat


        DateFormat inputFormatter1 = new SimpleDateFormat(inputFormat1, Locale.ENGLISH);
        DateFormat inputFormatter2 = new SimpleDateFormat(inputFormat2, Locale.ENGLISH);
        DateFormat inputFormatter3 = new SimpleDateFormat(inputFormat3, Locale.ENGLISH);
            // Parse the input date
                 Date date1 = inputFormatter1.parse(time);
                 Date date2 = inputFormatter1.parse(time);
                 Date date3 = inputFormatter1.parse(time);                // Format the parsed date to the desired output format
                DateFormat outputFormatter = new SimpleDateFormat(outputFormat, Locale.ENGLISH);
                // DateFormat outputFormatter1 = new SimpleDateFormat(outputFormat, Locale.ENGLISH);
                return outputFormatter.format(date1);



        }


    public static void main(String[] args) throws ParseException {
        // Conversion of format to EEE dd MMM
        String time1 =  "2024-02-28";
        String time2 =  "02-28-2024";
       // String time3 = "2024/06/13";

        System.out.println("Date1: " + convertToEEEddMMM(time1));
        System.out.println("Date2: " + convertToEEEddMMM(time2));
       // System.out.println("Date3: " + convertToEEEddMMM(time3));

    }
}
