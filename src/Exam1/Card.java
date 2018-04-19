package Exam1;

import java.util.Random;

public class Card {
  String color;
  String value;
  private static int counter;


  public Card() {
    color = randomColor();
    value = randomValue();
  }

  public String getColor() {
    return color;
  }

  public String getValue() {
    return value;
  }

  public String randomColor() {
    String[] colors = { "Club", "Diamond", "Heart", "Spade" };
    String color = colors[counter];
    if (counter < 3){
      counter++;
    }else {
      counter = 0;
    }
    return color;
  }

  public String randomValue() {
    String[] days = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    Random ran = new Random();
    int randNum = ran.nextInt(days.length);
    String randomDay = days[randNum];
    return randomDay;
  }


  @Override
  public String toString() {
    return value + " " + color ;
  }
}
