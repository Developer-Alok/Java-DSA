class Pen {
  String Color;
  int Tip;

  void setColor(String newColor) {
    Color = newColor;
  }
  void setTip(int newSize) {
    Tip = newSize;
  }
}
public class _1_create_a_object {
    public static void main(String[] args) {
    Pen p1 = new Pen();
    p1.setColor("red");
    p1.setTip(4);
    System.out.println(p1.Color);
    System.out.println(p1.Tip);
    p1.Color = "blue";
    p1.Tip = 5;
    System.out.println(p1.Color);
    System.out.println(p1.Tip);

  }

}