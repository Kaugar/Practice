package Exam2;

public class Fish {
  private String name;
  private int weight;
  private String color;

  public Fish(String name, int weight, String color) {
    this.name = name;
    this.weight = weight;
    this.color = color;

  }
  public void feed (){
    weight += 2;
  }
  public String status (){
    return "Name: " + name + ", weight: " + weight + ", color: " + color;
  }

  public int getWeight() {
    return weight;
  }
}
