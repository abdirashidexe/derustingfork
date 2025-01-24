public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float num = -3.44f;
    System.out.println(num);

    // Create an int with a positive value and assign it to a variable
    int x = 2;
    System.out.println(x);

    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainder = 7%3;
    System.out.println(remainder);

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    int numEorO = 3;
    if (numEorO % 2 == 0)
    {
      System.out.println("This number is even: " + numEorO);
    }
    else
    {
      System.out.println("This number is odd: " + numEorO);
    }

    // Divide the number by another number using integer division
    int result = numEorO/x;
    System.out.println("int division result: " + result);

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
