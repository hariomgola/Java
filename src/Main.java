import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Main _main = new Main();
        // _main.ArrayListFunction(); // Array List
        // _main.LinkedListFunction(); // Linked List
        _main.ArrayLinkedSortingFunction();
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

    public void LinkedListFunction(){
        /**
         * Linked List has all the similar function as of Array List since both are being inherit from list.
         * The Main Difference b/w the array list and the link list is 
         *   - When an new element is added to Array list it will create the new array and replace the old array.
         *   - When an new element is added to linked list it will create a container and linked to the previous conatiner.
         * 
         * Remember
         *  - Linked list store an element in container while as array list store in array.
         *  - Linked list is fast for inserting and deleting operation. It lags in randomly Accessing element.
         *  - Array list is fast in Accessing random Accessing element.
         */
        // Linked list Example
        System.out.println("========= Linked List =========");
        LinkedList<String> language = new LinkedList<String>();
        // - Adding the data into the Linked list
        language.add("Java");
        language.add("JavaScript");
        System.out.println(language);

        // Additional Methord provided by linked List
        language.addFirst("Angular");
        language.addLast("React");
        System.out.println(language);

        language.removeFirst();
        language.removeLast();
        System.out.println(language);

        language.getFirst();
        language.getLast();
    }

    public void ArrayLinkedSortingFunction(){
        System.out.println("========= Sorting Array and Linked List =========");
        ArrayList<String> language = new ArrayList<String>();
        language.add("Java");
        language.add("Angular");
        language.add("React");
        language.add("JavaScript");

        // Sorting the collection
        System.out.println("Unsorted linekd list - "+language);
        Collections.sort(language);
        System.out.println("Sorted Linekd List - "+language);
        Collections.sort(language,Collections.reverseOrder());
        System.out.println("Sorted Reverse Linekd List - "+language);
    }

    public void HashMapFunction(){

    }


}