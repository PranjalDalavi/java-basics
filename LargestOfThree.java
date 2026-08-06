import java.util.Scanner;

public class LargestOfThree {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

  System.out.print("Eenter first number:");
   int a = sc.nextInt();

  System.out.print("Enter second number:");
   int b = sc.nextInt();

  System.out.print("Enter Third number:");
    int c = sc.nextInt();

 if (a>=b && a>=c) {
   System.out.printIn("Largest number is:" +a);
 } else if (b >=a && b>=c) {
   System.out.printIn("Largest number is:" +b);
 } else {
   System.out.printIn("Largest number is:" +c);
 }
    sc.close();
  }
}
