import java.util.*;
public class Main {
  
  public static String RemoveVowels(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
        str = str.substring(0, i) + str.substring(i + 1);
        i--;
      }
    }
    return str;
  }

  public static void main(String[] args) {
    String str = "take u forward";
    System.out.println("String after removing the vowels \n"+RemoveVowels(str));
  }
}
