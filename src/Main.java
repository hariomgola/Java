import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Main _main = new Main();
        _main.ArrayListFunction(); // Array List
    }

    public void ArrayListFunction() {
        // Array list Example
        System.out.println("========= Array List =========");
        ArrayList<String> language = new ArrayList<String>();
        // - Adding the data into the Array list
        language.add("Java");
        language.add("JavaScript");
        System.out.println("Adding the Element - " + language);

        // - Adding the data with particular index
        language.add(0, "Angular");
        language.add(2, "React");
        System.out.println("Adding the Element with particular Index - " + language);

        // - Access or getting an item from Array list
        String firstLanuage = language.get(0);
        System.out.println("Accessing the first element - " + firstLanuage);

        // - Change or setting an item from the Array list
        language.set(0, "nodeJs");
        System.out.println("Array List After Changing Item - " + language);

        // - Deleting and removing An Item from Array List
        language.remove(0);
        System.out.println("Array List After Removing Item - " + language);

        // - length of Array list
        System.out.println("Array List length - " + language.size());

        // - Iterting Through Array List
        for (int i = 0; i < language.size(); i++) {
            System.out.println("Array list value at " + i + " = " + language.get(i));
        }

        // - Iterating Through an Advance for Each Loop
        for (String _language : language) {
            System.out.println("Array at particular Iteration is - " + _language);
        }

        // - Deleting All Items from the Array List
        language.clear();
        System.out.println("Array List After Cleaning All Items - " + language);
    }
}