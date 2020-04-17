package packages.Lab_4;

import java.util.Scanner;
import packages.Lab_4.inputClass.*;
import packages.Lab_4.testClass.*;
import packages.TestInput.*;

public class Lab4 extends testClass {
 
  public static String myStr;
  public static String myChar;

  public static void mainFourthLab() {
    int devBrunch = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Choose what to do: \n" + 
                  "1. Input String from Console \n" + 
                  "2. Do ten tests");

    try {
      devBrunch = TestInput.testInput(1);
    } catch (Exception e) {
      e.printStackTrace();
    }

    switch (devBrunch) {
      case (1):
        inputClass.inputText();
        String otherStr = strToDot(myStr, myChar);
        System.out.println(otherStr);
        break;
      case (2):
        testClass.doTenTests();
        break;
      default:
        System.out.println("Something Wrong!!!");
        break;
      }
    in.close();
  }
}
