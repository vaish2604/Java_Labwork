package JavaBasics;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        // Create a HashSet for fruits and add elements
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Create a HashSet for vegetables and add elements
        Set<String> vegetables = new HashSet<>();
        vegetables.add("Carrot");
        vegetables.add("Onion");
        vegetables.add("Tomato");
        vegetables.add("Capsicum");
        vegetables.add("Apple"); // Adding a common item for testing intersection

        // Print initial sets
        System.out.println("Fruits: " + fruits);
        System.out.println("Vegetables: " + vegetables);

        // Perform Union operation (combine all elements from both sets)
        Set<String> unionSet = new HashSet<>(fruits);
        unionSet.addAll(vegetables);
        System.out.println("Union of Fruits and Vegetables: " + unionSet);

        // Perform Intersection operation (elements common to both sets)
        Set<String> intersectionSet = new HashSet<>(fruits);
        intersectionSet.retainAll(vegetables);
        System.out.println("Intersection of Fruits and Vegetables: " + intersectionSet);

        // Perform Difference operation (elements in fruits but not in vegetables)
        Set<String> differenceSet = new HashSet<>(fruits);
        differenceSet.removeAll(vegetables);
        System.out.println("Difference of Fruits and Vegetables (Fruits - Vegetables): " + differenceSet);

        // Check if the vegetables set is a subset of the fruits set
        boolean isSubset = fruits.containsAll(vegetables);
        System.out.println("Are Vegetables a subset of Fruits? " + isSubset);

        // Demonstrate LinkedHashSet to maintain insertion order
        Set<String> orderedFruits = new LinkedHashSet<>(fruits);
        Set<String> orderedVegetables = new LinkedHashSet<>(vegetables);
        System.out.println("Ordered Fruits: " + orderedFruits);
        System.out.println("Ordered Vegetables: " + orderedVegetables);
    }
}
