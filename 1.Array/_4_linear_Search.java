import java.util.Scanner;

public class _4_linear_Search {

  public static int linearSearch(int numbers[], int key) {
    System.out.println("size of array:"+ numbers.length);
    for (int i = 0; i < numbers.length; i++) {
      if(numbers[i]==key){
        return i;
      } 
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size array:");
    int size = sc.nextInt();

    int numbers[] = new int[size];
    System.out.print("Enter the array element:");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = sc.nextInt();
    }
    System.out.print("the array is:");
    for (int j = 0; j < numbers.length; j++) {

      System.out.println(numbers[j] + " ");
      }
    System.out.println("------------");
    System.out.print(" enter the key element:");
    int key = sc.nextInt();
     int index=linearSearch(numbers, key);
     if(index==-1){
      System.out.println("element not found");
     }
     else{
      System.out.println(" element at :"+ index + " index");
     }

  }
}
