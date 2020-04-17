package packages.Lab_2.Matrix;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Matrix {

  private int[][] value;
  private int[] copy = new int[]{};
  private int rows;
  private int cols;

  public Matrix(int rowsAndCols) {
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
