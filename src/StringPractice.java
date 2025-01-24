import java.util.List;
import java.util.ArrayList;;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "hello";

    // Find the length of the string
    System.out.println(word.length());

    // Concatenate (add) two strings together and reassign the result
    word = "NewWord";
    System.out.println(word);

    // Find the value of the character at index 3
    System.out.println(word.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    if (word.contains("New"))
    {
      System.out.println(true);
    }
    else
    {
      System.out.println(false);
    }

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < word.length(); i++)
    {
      System.out.println(word.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> myArray = new ArrayList<String>();

    // Add multiple strings to the List (OK to do one-by-one)
    for (int i=0; i < 4; i++)
    {
      myArray.add("String" + i);
    }
    System.out.println(myArray);

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String singleString = String.join(",", myArray);
    System.out.println(singleString);

    // Check whether two strings are equal
    if (word.equals("NewWord"))
    {
      System.out.println(true);
    }
    else
    {
      System.out.println(false);
    }

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
