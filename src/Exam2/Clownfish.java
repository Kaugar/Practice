package Exam2;

public class Clownfish extends Fish {
  String stripecolor;

  public Clownfish(String name, int weight, String color, String stripe) {
    super(name, weight, color);
    this.stripecolor = stripe;
  }

  @Override
  public String status() {
    return super.status() + ", stripes: " + stripecolor;
  }
}
