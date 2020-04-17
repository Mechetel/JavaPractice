package packages.Lab_2;

import java.util.Scanner;
import packages.Lab_2.TestMatrix.*;
import packages.Lab_2.Matrix.*;
public class Lab2 {

  static Scanner input = new Scanner(System.in);

  public static void mainSecondLab(){
    System.out.println("Remember, your matrix is square");
    System.out.println("1:Do 10 test\n2:work only with 1 matrix");
    int TestOrMatrixInt = testInput(1); //1 означает что я буду требовать от пользователя цифры 1 или 2

    System.out.println("-------------------------");

    if (TestOrMatrixInt == 1) { 
      TestMatrix.doTenTests();
    } 
    else if (TestOrMatrixInt == 2) {
      System.out.println("Input number of rows and columns:");
      int numOfRowsAndColsInt = testInput(2); //2 означает что нужно ввести только целое число

      System.out.println("1:Input matrix with random numbers\n2:Input matrix from console");
      int choiseHowToInputInt = testInput(1); // 1 означает что я буду требовать от пользователя цифры 1 или 2

      System.out.println("-------------------------");
      Matrix m1 = new Matrix(numOfRowsAndColsInt);
      m1.doChoiceAboutHowToFillMatrix(choiseHowToInputInt);
      m1.printMatr();
      System.out.println("summ " + m1.summ());
      m1.sortTriangle();

      input.close();
    }
  }

  public static int testInput(int whatQuest) {
    int outputValue;
    while (true) {
      String line = input.nextLine();
      try {
        outputValue = Integer.parseInt(line);
        if (whatQuest == 1){
          if (oneOrTwoQuest(outputValue)) {
            return outputValue;
          }
        }
        else if (whatQuest == 2){
          if (moreThenZeroQuest(outputValue)){
            return outputValue;
          }
        }
      } catch (NumberFormatException e) {
          // не выдаст ошибку и будет ждать следующего ввода строки
      }
    }
  }

  public static boolean oneOrTwoQuest(int value){
  if (value == 1 || value == 2){
    return true;
  } else {
    System.out.println("Error: input must be only \"1\" or \"2\" ");
    return false;
  }
}

  public static boolean moreThenZeroQuest(int value){
    if (value > 0){
      return true;
    } else {
      System.out.print("Error: input must be a positive integer.\n");
      return false;
    }
  }
}