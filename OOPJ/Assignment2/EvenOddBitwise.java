import java.util.Scanner;

public class EvenOddBitwise{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a numbers: ");
    int n = sc.nextInt();
    if ((n & 1) == 0) {
      System.out.print(n + " is Even: ");
    } else {
      System.out.print(n + " is Odd: ");
    }
  }
}