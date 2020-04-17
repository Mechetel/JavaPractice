import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class testClass {

  static String strToDot(String str, String myChar) {
    Pattern pattern =
    Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS 
            | Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(str);
    ArrayList<String> words = new ArrayList<String>();
    while (matcher.find())
      words.add(matcher.group());
    String result = "";
    for(String word : words){
      StringBuilder sb = new StringBuilder();
      char cha = word.charAt(0);
      sb.append(cha);
      for (int i = 1; i < word.length(); i++){
        if (word.charAt(i) == cha){
          sb.append(myChar);
        }
        else {
          sb.append(word.charAt(i));
        }
      }
      word = sb.toString();
      result += word + " ";
    }
    
    return result;
  } 

  public static String generateRandomString(int length) {
    if (length < 1) throw new IllegalArgumentException();
    StringBuilder sb = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      int rndCharAt = random.nextInt(CHAR_LOWER.length());
      char rndChar = CHAR_LOWER.charAt(rndCharAt);
      sb.append(rndChar);
    }
    return sb.toString();
  }

  static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz ";
  static SecureRandom random = new SecureRandom();

  static void doTenTests() {
    for (int i = 0; i < 10; i++) {
      String result  = generateRandomString(50);
      System.out.println("result :     " + result);
      String newResult = strToDot(result, "Х");
      System.out.println("new result : " + newResult);
      System.out.println("\n");
    }
  }
}