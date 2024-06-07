import java.util.Scanner;

public class _2_userInput_Array {
  public static void main(String[] args) {
    int num[]=new int[4];
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the array element:");
    for (int i = 0; i < num.length; i++) {
      num[i]=sc.nextInt();
    }
    System.out.println("the array element is:");
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i]+" ");
      
    }
  }
  
}
