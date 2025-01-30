public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        // Put values in the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print the third number (remember, counting starts at 0)
        System.out.println("The third number is: " + numbers[2]);

        // Loop through all numbers and print them
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + " is: " + numbers[i]);
        }
    }
}
