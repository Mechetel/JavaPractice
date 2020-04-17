import packages.Lab_1.Lab1;
import packages.Lab_2.Lab2;
import packages.Lab_4.Lab4;
import packages.TestInput.*;

class Lab5 {
  public static void main(String[] args) throws Exception {
    int devBrunch = 0;
   
    System.out.println("Choose what to do: \n" + 
                  "1. Test First Lab \n" +
                  "2. Test Second Lab \n" +
                  "3. Test Fourth Lab  ");

    try {
      devBrunch = TestInput.testInput(3);
    } catch (Exception e) {
      e.printStackTrace();
    }

    switch (devBrunch) {
      case (1):
        Lab1.mainFirstLab();
        break;
      case (2):
        Lab2.mainSecondLab();
        break;
      case (3):
        Lab4.mainFourthLab();
        break;
    default:
        System.out.println("Something Wrong!!!");
        break;
    }
    System.out.println("Testing was ended");
  }
}
