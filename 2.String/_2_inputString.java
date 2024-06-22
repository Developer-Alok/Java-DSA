import java.util.Scanner;

public class _2_inputString {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter your name: ");
    String name = sc.nextLine(); // for multiple word
    String name2 = sc.next(); // for single word

    System.out.println(name);
    System.out.println(name2);

  }

}
