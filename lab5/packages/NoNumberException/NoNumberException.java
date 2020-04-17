package packages.NoNumberException;

public class NoNumberException extends Exception { 

  private static final long serialVersionUID = 1L;

  public String toString() {
    return "You must input positive number, not string"; 
  } 
}