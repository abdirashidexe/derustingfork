import java.util.Arrays;

public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] myArray = new String[4];
    System.out.println(myArray.toString());

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    /*for (int i = 0; i < myArray.length; i++)
    {
      myArray[i] = "index" + i;
    }*/
    myArray[0] = "index0";
    myArray[1] = "index1";
    myArray[2] = "index2";
    myArray[3] = "index3";
    System.out.println(Arrays.toString(myArray));

    // Get the value of the array at index 2
    System.out.println(myArray[2]);

    // Get the length of the array
    System.out.println(myArray.length);

    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < myArray.length; i++)
    {
      System.out.println("for-loop: " + myArray[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    for (String item : myArray)
    {
      System.out.println("for-each loop: " + item);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
