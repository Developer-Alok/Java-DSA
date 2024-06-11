class pen {
  private String color;
  private int tip;

  void setColor(String color) {
    this.color = color;

  }

  void setTip(int tip) {
    this.tip = tip;
  }

  String getColor() {
    return this.color;
  }

  int getTip() {
    return this.tip;
  }

}

public class _3_Getters_Setters_this {
  public static void main(String[] args) {

    pen p1 = new pen();
    p1.setColor("red");
    p1.setTip(6);
    System.out.println(p1.getColor());
    System.out.println(p1.getTip());

  }

}
