class Student {
  String name;
  int roll;

  // Student(String name) {

  // System.out.println(name);
  // }
  void Student() {
    System.out.println(" constructor is called ....");
  }
}

public class _4_Constructors {
  public static void main(String[] args) {
    // Student s1 = new Student("alok");
    Student s1 = new Student();
    s1.Student();
  }

}
