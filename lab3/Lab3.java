import packages.Lab_1.Lab1;
import packages.Lab_2.Lab2;
import java.util.Scanner;

class Lab3 {
  public static void main(String[] args){
    int devBrunch = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Choose what to do: \n" +
            "1. Test First Lab \n" +
            "2. Test Second Lab  ");
    do {
      devBrunch = in.nextInt();
    } while ((devBrunch < 1) || (devBrunch > 2));
        
    switch (devBrunch) {
    case (1):
      Lab1.mainFirstLab();
      break;
    case (2):
      Lab2.mainSecondLab();
      break;
    default:
      System.out.println("Something Wrong!!!");
      break;
    }
    System.out.println("Testing was ended");
    in.close();
  }
}
