import java.util.Scanner;

import packages.Lab_1.*;
import packages.Lab_2.TestMatrix.*;

public class Lab4 extends testClass {
  public static String myStr;
  public static String myChar;
  public static void main(String[] args) {
    int Brunch = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Choose what to do: \n" +
            "1. Input String from Console \n" +
            "2. Do ten tests \n" +
            "3. Do tests from 1,2,4 labs");
    do {
      Brunch = in.nextInt();
    } while ((Brunch < 1) || (Brunch > 3));
        
    switch (Brunch) {
      case (1):
        inputClass.inputText();
        String otherStr = strToDot(myStr, myChar);
        System.out.println(otherStr);
        break;
      case (2):
        testClass.doTenTests();
        break;
      case (3):
        Lab1.mainFirstLab();
        TestMatrix.doTenTests();
        testClass.doTenTests();
        break;
      default:
        System.out.println("Something Wrong!!!");
        break;
    }
    in.close();
  }
}
