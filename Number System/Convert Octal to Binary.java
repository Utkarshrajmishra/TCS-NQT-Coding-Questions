import java.util.*;
public class Main {
  public static int DecimaltoBinary(int decimal) {
    int Binary = 0;
    int i = 0;
    while (decimal != 0) {
      int rem = decimal % 2;
      Binary += (rem * Math.pow(10, i));
      i++;
      decimal = decimal / 2;
    }
    return Binary;
  }
  public static int OctaltoDecimal(int Octal) {
    int Decimal = 0;
    int i = 0;
    while (Octal != 0) {
      int rem = Octal % 10;
      Decimal += rem * Math.pow(8, i);
      i++;
      Octal /= 10;
    }
    return Decimal;
  }
  public static void main(String[] args) {
    int Octal = 345;
    int Decimal = OctaltoDecimal(Octal);
    System.out.println("The binary conversion of the given octal number is 
    "+DecimaltoBinary(Decimal));
  }
 
}
 
