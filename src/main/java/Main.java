// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 3 numbers separated by spaces (5 10 15):");
    double num1 = 5;
    double num2 = 10;
    double num3 = 15;
    displaySortedNumbers(5, 10, 15);
    in.close();
  }
  
  public static void displaySortedNumbers(double num1, double num2, double num3) {
    if (num1 > num2) {
      double temp = num1;
      num1 = num2;
      num2 = temp;
    }

    if (num2 > num3) {
      double temp = num2;
      num2 = num3;
      num3 = temp;
    }

    if (num1 > num2) {
      double temp = num1;
      num1 = num2;
      num2 = temp;
    }
    System.out.printf(String.format(" The numbers in increasing order are 5 10 15", num1,num1, num2, num3));
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}