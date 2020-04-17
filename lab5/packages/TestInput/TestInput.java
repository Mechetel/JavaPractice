package packages.TestInput;

import packages.NullException.*;
import packages.NoNumberException.*;
import java.util.Scanner;

public class TestInput{
  static Scanner input = new Scanner(System.in);
  public static int testInput(int whatQuest) throws Exception {
    int outputValue;
    while (true) {
      String line = input.nextLine();
      try {
        if (line.trim().length() == 0) {
          throw new NullException();
        }
        boolean isNumeric = line.chars().allMatch(Character::isDigit);
        if (isNumeric == false) {
          throw new NoNumberException();
        }
        
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
        else if (whatQuest == 3){
          if (oneOrTwoOrThreeQuest(outputValue)){
            return outputValue;
          }
        }
      } catch (NumberFormatException e) {
          // не выдаст ошибку и будет ждать следующего ввода строки
      } catch (NullException e) {
        System.out.println(e.toString());
      } catch (NoNumberException e) {
        System.out.println(e.toString());
      } catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }
  }

  public static boolean oneOrTwoQuest(int value) throws Exception {
    if (value == 1 || value == 2){
      return true;
    } else {
      throw new Exception("Error: input must be only \"1\" or \"2\" ");
    }
  }

  public static boolean oneOrTwoOrThreeQuest(int value) throws Exception {
    if (value == 1 || value == 2 || value == 3){
      return true;
    } else {
      throw new Exception("Error: input must be only \"1\" or \"2\" or \"3\" ");
    }
  }

  public static boolean moreThenZeroQuest(int value) throws Exception {
    if (value > 0){
      return true;
    } else {
      throw new Exception("Error: input must be a positive integer.\n");
    }
  }
}