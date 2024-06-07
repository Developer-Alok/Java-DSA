public class _6_BinarySearch_Array {

  public static int binarySearch(int number[], int key) {
    int start = 0;
    int end = number.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      for (int i = 0; i < number.length; i++) {
        if (number[mid] == key) {
          return mid;
        }
         if (number[mid] < key) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }

    return -1;

  }

  public static void main(String[] args) {
    int number[] = { 2, 4, 6, 8, 10, 12, 14 };
    int key = 14;
   int search=binarySearch(number, key);
   System.out.println(search +" index");
  }

}
