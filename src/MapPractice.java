import java.util.Map;
import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> myMap = new HashMap<String, Integer>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    myMap.put("item_0", 0);
    myMap.put("item_1", 1);
    myMap.put("item_2", 2);
    System.out.println(myMap);

    // Get the value associated with a given key in the Map
    System.out.println(myMap.get("item_1"));

    // Find the size (number of key/value pairs) of the Map
    System.out.println(myMap.size());

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    myMap.put("item_1", 99);
    System.out.println(myMap);

    // Check whether the Map contains a given key
    if (myMap.containsKey("item_7"))
    {
      System.out.println(true);
    }
    else
    {
      System.out.println(false);
    }

    // Check whether the Map contains a given value
    if (myMap.containsValue(99))
    {
      System.out.println(true);
    }
    else
    {
      System.out.println(false);
    }

    // Iterate over the keys of the Map, printing each key
    for (String key : myMap.keySet())
    {
      System.out.println("for-each key: " + key);
    }

    // Iterate over the values of the map, printing each value
    for (Integer value : myMap.values())
    {
      System.out.println("for-each value: " + value);
    }

    // Iterate over the entries in the map, printing each key and value
    for (String keyEntry : myMap.keySet())
    {
      System.out.println("Key: " + keyEntry + " & the value: " + myMap.get(keyEntry));
    }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
