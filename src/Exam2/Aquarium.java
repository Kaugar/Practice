package Exam2;

import java.util.ArrayList;

public class Aquarium {
  private ArrayList<Fish> fishes = new ArrayList<Fish>();

  public void add (Fish fish){
    fishes.add(fish);
  }

  public String status (){
    StringBuilder status = new StringBuilder(5);
    for (int i = 0; i < fishes.size(); i++) {
      status.append(fishes.get(i).status() + "\n");

    }
    return status.toString();
  }

  public void feed (){
    for (int i = 0; i < fishes.size(); i++) {
      fishes.get(i).feed();
    }
  }

  public void removeOversizedFishes() {
    for (int i = 0; i < fishes.size(); i++) {
      if (fishes.get(i).getWeight() >= 11){
        fishes.remove(i);
      }
    }
  }
}
