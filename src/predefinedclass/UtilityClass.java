package predefinedclass;

// Class that has only static method. Sometime called as Helper class
// provide methods for executing certain functionalities within a program
// that has private constructor()
//Methods of a utility are accessed via the class name.
// eg. Math,
public class UtilityClass {

    private UtilityClass(){

    }
    // Helper method that returns everything capital
    public static String returnUpperCase(String stringInput){
        return stringInput.toUpperCase();
    }

    // Helper method that returns the first letter capital and others small
    public static String firstLetter(String stringInput){
        if (stringInput == null || stringInput.isEmpty()){
            return stringInput;
        }
        return Character.toUpperCase(stringInput.charAt(0))+ stringInput.substring(1);
    }

    // Helper method to format two decimal values
    public static double twoDecimalFormat(double inputValue){
        String decimalFormatValue = String.format("%.2f", inputValue);
        return Double.parseDouble(decimalFormatValue);
    }





    public static void main(String[] args) {
        int a = Math.min(12,17);
        System.out.println(a);

        String result = returnUpperCase("testing");
        System.out.println(result);

        String invincible = firstLetter("invincible");
        System.out.println(invincible);

        double v = twoDecimalFormat(12.232232);
        System.out.println(twoDecimalFormat(v));

        // Conversion of format to EEE dd MMM
        String time1 =  "2024-02-28";
        String time2 =  "02-28-2024";
        String time3 = "2024/02/28";

    }
}
