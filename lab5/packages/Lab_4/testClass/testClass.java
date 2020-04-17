package packages.Lab_4.testClass;
import java.security.SecureRandom;
//import java.util.*; 
public class testClass {

  protected static String strToDot(String str, String myChar) {
  //  Set<Character> set = new HashSet<>(); //закоментированный код был предназначен для задания 
  /*  for (char c : str.toCharArray()){     //когда все повторяющиеся чары кроме первого надо было заменить 
      if (c == ' ') {                       //на заданный символ 
        sb.append(' ');                     //Считаю что такое задание было бы сложнее и лучше 
      }                                     //чем то что есть в данном варианте
      else {                                //как минимум потому что в нем реально нужно было бы выдумать
        if (!set.contains(c)) {             //минимально затратный алгоритм
          set.add(c);                       //Как например здесь, используя не два цикла (самый простой способ)
          sb.append(c);                     //а хеш таблицу которая выполняет все задание за один проход
        }
        else { 
          sb.append(myChar);
        }
      }
     } */
    StringBuilder sb = new StringBuilder();
    char cha = str.charAt(0);
    sb.append(cha);
    for (int i = 1; i < str.length(); i++){
      char c = str.charAt(i);
      if (c == ' '){
        sb.append(' ');
      }
      else {
        if (str.charAt(i) == cha){
          sb.append(myChar);
        }
        else {
          sb.append(str.charAt(i));
        }
      }
    }
    String result = sb.toString();
    
    return result;
  } 

  public static String generateRandomString(int length) {
    if (length < 1) throw new IllegalArgumentException();
    StringBuilder sb = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
      char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);
      sb.append(rndChar);
    }
    return sb.toString();
  }

  static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
  static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
  static final String NUMBER = "0123456789";

  static final String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;
  static SecureRandom random = new SecureRandom();

  protected static void doTenTests() {
    System.out.println("By default char to replace is \'.\'");
    for (int i = 0; i < 10; i++) {
      String result  = generateRandomString(30);
      System.out.println("result :     " + result);
      String newResult = strToDot(result, "Х");
      System.out.println("new result : " + newResult);
      System.out.println("\n");
    }
  }
}