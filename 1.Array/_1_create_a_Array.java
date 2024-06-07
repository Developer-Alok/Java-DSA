public class _1_create_a_Array {
  public static void main(String[] args) {
    int array[]=new int[3];
    array[0]=2;
    array[1]=4;
    array[2]=6;

    System.out.println("The array length is:"+array.length);
    System.out.print(array[0]+" ");
    System.out.print(array[1]+" ");
    System.out.println(array[2]);

    System.out.print("Using for loop:");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]+" ");
      
    }
  }
}