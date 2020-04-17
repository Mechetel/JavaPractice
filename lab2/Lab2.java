import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Lab2 {
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("Remember, your matrix is square");
    System.out.println("1:Do 10 test\n2:work only with 1 matrix");
    int TestOrMatrixInt = testInput(1); //1 означает что я буду требовать от пользователя цифры 1 или 2

    System.out.println("-------------------------");

    if (TestOrMatrixInt == 1) { 
      Test t1 = new Test();
      t1.doTenTests();
    } 
    else if (TestOrMatrixInt == 2) {
      System.out.println("Input number of rows and columns:");
      int numOfRowsAndColsInt = testInput(2); //2 означает что нужно ввести только целое число

      System.out.println("1:Input matrix with random numbers\n2:Input matrix from console");
      int choiseHowToInputInt = testInput(1); //1 означает что я буду требовать от пользователя цифры 1 или 2

      System.out.println("-------------------------");
      Matrix m1 = new Matrix(numOfRowsAndColsInt);
      m1.doChoiceAboutHowToFillMatrix(choiseHowToInputInt);
      m1.printMatr();
      System.out.println("summ " + m1.summ());
      m1.sortTriangle();

      input.close();
    }
  }

  static public int testInput(int whatQuest) { 
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

  static public boolean oneOrTwoQuest(int value){
    if (value == 1 || value == 2){
      return true;
    } else {
      System.out.println("Error: input must be only \"1\" or \"2\" ");
      return false;
    }
  }

  static public boolean moreThenZeroQuest(int value){
    if (value > 0){
      return true;
    } else {
      System.out.print("Error: input must be a positive integer.\n");
      return false;
    }
  }
}

class Matrix {

  private int[][] value;
  private int[] copy = new int[]{};
  private int rows;
  private int cols;

  Matrix(int rowsAndCols) {
    this.rows = rowsAndCols;
    this.cols = rowsAndCols;
    this.value = new int[rows][cols];
  }

  public void doChoiceAboutHowToFillMatrix(int choise) {
    if (choise == 1){
      this.setMatrixWithRandomNumbers();
    } else {
      this.fillFronConsole();
    } 
  }

  public void setMatrixWithRandomNumbers(){
    for (int i = 0; i < this.rows; i++) {
      for (int j = 0; j < this.cols; j++) {
        this.value[i][j] = getRandomNumberInRange(0, 9);
      }   
    }
  }

  public void fillFronConsole(){
    Scanner sc = new Scanner(System.in);
    try {    
      for (int i = 0; i < this.rows; i++) {
        for (int j = 0; j < this.cols; j++) {
          this.value[i][j] = sc.nextInt();
        }
      }
    } finally {
      sc.close();
    }
  }

  private int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
  }

  public int summ(){
    int summa = 0;
    for (int i = 0; i < this.cols; i++) {
      for (int j = 0; j <= i && j <= this.cols - 1 - i; j++) {
        summa += this.value[i][j];   
      }
    }
    return summa;
  }

  public void sortTriangle() {
    for (int j = 0; j < this.cols; j++) {
      for (int i = 0; i <= j && i <= this.cols - 1 - j; i++) {
         incertToArr(copy, this.value[i][j]); 
        }  
      }
    printArr(copy);
    bubbleSort(copy);
    System.out.print("Sorted ");
    printArr(copy);
    int k = 0;
    for (int i = 0; i < this.cols; i++) {
      for (int j = 0; j < this.rows; j++) {
        if (i <= j && i <= this.cols - 1 - j){
          this.value[i][j] = copy[k++];
        }
      }
    }
    this.printMatr();
  }
 
  private void incertToArr(int[] arr, int addvalue){
    copy = Arrays.copyOf(arr, arr.length + 1);
    copy[copy.length - 1] = addvalue;
  }

  private void bubbleSort(int[] arr) {  
    int n = arr.length;  
    int temp = 0;  
    for(int i = 0; i < n; i++){  
      for(int j = 1; j < (n - i); j++){  
        if(arr[j - 1] > arr[j]){   
          temp = arr[j - 1];  
          arr[j - 1] = arr[j];  
          arr[j] = temp;  
        }               
      }  
    }
  }

  public void printMatr() {
    for (int r = 0; r < this.rows; r++) {
      for (int c = 0; c < this.cols; c++) {
        System.out.print(this.value[r][c]+ " ");
        }
      System.out.println();
    }
  }

  private void printArr(int[] array) {
    System.out.print("Array: ");
    for (int i = 0; i < array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

}

class Test{
  public void doTenTests() {
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
