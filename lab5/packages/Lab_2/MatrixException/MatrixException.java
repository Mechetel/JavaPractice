package packages.Lab_2.MatrixException;

public class MatrixException extends Exception{

  private static final long serialVersionUID = 1L;
  private int number;
  
  public int getNumber(){
    return number;
  }

  public MatrixException(String message, int num){
    super(message);
    number=num;
  }
  public MatrixException(String message){
    super(message);
  }
}