package packages.Lab_4.inputClass;

import java.util.Scanner;
import packages.Lab_4.Lab4;

public class inputClass {

  public static void inputText() {
    Scanner in = new Scanner(System.in);
    System.out.println("input your string here");
    Lab4.myStr = in.nextLine();
    System.out.println("input char you want to replace");
    Lab4.myChar = in.nextLine();
    in.close();
  }
}