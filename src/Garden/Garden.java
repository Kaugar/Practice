package Garden;

import java.util.ArrayList;

public class Garden {
  private ArrayList <Plant> plants = new ArrayList<>();

  public ArrayList<Plant> getPlants() {
    return plants;
  }

  public void addWater (int water){
    int howManyNeedsWater = 0;
    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).getWaterlevel() < plants.get(i).getNeedsWater()){
        howManyNeedsWater++;
      }
    }
    int waterForEach = water/howManyNeedsWater;
    for (int i = 0; i < plants.size(); i++) {
      plants.get(i).getWater(waterForEach);
    }

    System.out.println("Watering with " + water);

  }

}
