
class Animal {  // parent class

  String color;

  void isEat(String food) {
    System.out.println(food);
  }

  void isBreath() {
    System.out.println("yes");
  }

}

class fish extends Animal {// extend parent class animal
  void fins(int num) {
    System.out.println("fins:" + num);

  }
}

public class _5_Inharitance {
  public static void main(String[] args) {
    fish shark = new fish();// creating object

    Animal tiger=new Animal();
    tiger.isEat("meat");
    shark.isEat("small Fish");
    shark.fins(4);

  }

}
