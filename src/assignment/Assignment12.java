package assignment;

public class Assignment12 {
    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;

        }
    }

    public static void main(String[] args) {
        int[] reverseArray = {3, 4, 2, 6, 7, 8};
        reverse(reverseArray);

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : reverseArray) {
            System.out.print(num + " ");

        }

    }
}
