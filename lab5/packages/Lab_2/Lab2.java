package packages.Lab_2;

import java.util.Scanner;
import packages.Lab_2.TestMatrix.*;
import packages.Lab_2.Matrix.*;
import packages.Lab_2.MatrixException.*;
import packages.NoNumberException.*;
import packages.NullException.*;
import packages.TestInput.*;

public class Lab2 {

  static Scanner input = new Scanner(System.in);

  public static void mainSecondLab() throws Exception, NoNumberException, NullException {
    try {
      System.out.println("Remember, your matrix is square");
      System.out.println("1:Do 10 test\n2:work only with 1 matrix");
      
      int TestOrMatrixInt = TestInput.testInput(1); //1 означает что я буду требовать от пользователя цифры 1 или 2
      System.out.println("-------------------------");

      if (TestOrMatrixInt == 1) { 
        TestMatrix t1 = new TestMatrix();
        t1.doTenTests();
      } 
      else if (TestOrMatrixInt == 2) {
        try {
          System.out.println("Input number of rows and columns:");
          int numOfRowsAndColsInt = TestInput.testInput(2); //2 означает что нужно ввести только целое число
          
          System.out.println("1:Input matrix with random numbers\n2:Input matrix from console");
          int choiseHowToInputInt = TestInput.testInput(1); // 1 означает что я буду требовать от пользователя цифры 1 или 2

          System.out.println("-------------------------");
          Matrix m1 = new Matrix(numOfRowsAndColsInt);
          m1.doChoiceAboutHowToFillMatrix(choiseHowToInputInt);
          m1.printMatr();
          System.out.println("summ " + m1.summ());
          m1.sortTriangle();
        } catch (MatrixException ex) {
          System.out.println(ex.getMessage());
          System.out.println(ex.getNumber());
        } 
      }
    } catch (NullException e) {
      System.out.println(e.toString());
    } catch (NoNumberException e) {
      System.out.println(e.toString());
    } finally {
      input.close();
    }
  }
}