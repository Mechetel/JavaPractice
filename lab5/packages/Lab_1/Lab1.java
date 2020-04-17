package packages.Lab_1;
import packages.Lab_1.Test.*;
public class Lab1 {
  public static void mainFirstLab(){
    try {
      Test ts1 = new Test();
      ts1.doAllTests();
    } catch (Exception ex) {
      System.out.println(ex.getMessage());
    }
  }
}