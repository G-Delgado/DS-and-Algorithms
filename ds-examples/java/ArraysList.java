import java.util.ArrayList;

public class ArraysList {
    public static void main(String[] args) {
        // WE CAN ALSO USE LIST, WHICH IS A SUBTYPE
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<String>();

        // Add items to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print the list
        System.out.println("Fruits: " + fruits);

        // Get an item (the second fruit)
        System.out.println("Second fruit: " + fruits.get(1));

        // Change an item
        fruits.set(0, "Apricot");

        // Remove an item
        fruits.remove("Cherry");

        // Print the updated list
        System.out.println("Updated fruits: " + fruits);
    }
}
