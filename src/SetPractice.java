import java.util.HashSet;
import java.util.Set;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> mySet = new HashSet<String>();

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    for (int i=0; i<3; i++)
    {
      mySet.add("element" + i);
    }
    System.out.println(mySet);

    // Check whether the Set contains a given String
    if (mySet.contains("element2"))
    {
      System.out.println(true);
    }
    else
    {
      System.out.println(false);
    }

    // Remove an element from the Set
    mySet.remove("element2");
    System.out.println(mySet);

    // Get the size of the Set
    System.out.println(mySet.size());

    // Iterate over the elements of the Set, printing each one on a separate line
    String[] myArray = new String[2];
    mySet.toArray(myArray);

    for (int i=0; i<mySet.size(); i++)
    {
      System.out.println("Iteration: " + myArray[i]);
    }

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
