import java util Scanner;

public class UserInput {
   public static void main(string[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.print("Enter your name:");
  String name = sc.nextLine();

  System.out.print("Enter your age:");
  int age = sc.nextInt();

  System.out.print("Hello" +name);
  System.out.print("You are" +age+ "years old.");

  sc.close();

   }
}
