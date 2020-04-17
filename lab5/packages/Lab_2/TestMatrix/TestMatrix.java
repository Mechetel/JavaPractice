package packages.Lab_2.TestMatrix;

import packages.Lab_2.Matrix.*;
import packages.Lab_2.MatrixException.*;

public class TestMatrix{
  public void doTenTests() {
    for (int i = 1; i <= 10; i++){
      try {
        System.out.println(i + " matrix");
        Matrix testMatrix = new Matrix(i) ;
        testMatrix.setMatrixWithRandomNumbers();
        testMatrix.printMatr();
        System.out.println("triangle summ of " + i + " matrix is " + testMatrix.summ());
        System.out.println(i + " sorted matrix");
        testMatrix.sortTriangle();
        System.out.println("-------------------------");
      } catch (MatrixException ex) {
        System.out.println(ex.getMessage());
        System.out.println(ex.getNumber());
      }
    }   
  }
}
