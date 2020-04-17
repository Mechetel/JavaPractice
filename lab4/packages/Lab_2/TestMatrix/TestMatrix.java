package packages.Lab_2.TestMatrix;

import packages.Lab_2.Matrix.*;

public class TestMatrix{
  public static void doTenTests() {
    for (int i = 1; i <= 10; i++){
      System.out.println(i + " matrix");
      Matrix testMatrix = new Matrix(i);
      testMatrix.setMatrixWithRandomNumbers();
      testMatrix.printMatr();
      System.out.println("triangle summ of " + i + " matrix is " + testMatrix.summ());
      System.out.println(i + " sorted matrix");
      testMatrix.sortTriangle();
      System.out.println("-------------------------");
    }   
  }
}
