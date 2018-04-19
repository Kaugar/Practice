package Garden;

public class GardenApp {
  public static void main(String[] args) {
    Garden garden = new Garden();
    Plant tree1 = new Tree("purple");
    Plant tree2 = new Tree("orange");
    Plant flower1 = new Flower("yellow");
    Plant flower2 = new Flower("blue");

    garden.getPlants().add(flower1);
    garden.getPlants().add(flower2);
    garden.getPlants().add(tree1);
    garden.getPlants().add(tree2);


    for (int i = 0; i < garden.getPlants().size(); i++) {
      garden.getPlants().get(i).needsWater();
    }
    System.out.println("");
    garden.addWater(40);
    for (int i = 0; i < garden.getPlants().size(); i++) {
      garden.getPlants().get(i).needsWater();
    }
    System.out.println("");
    garden.addWater(70);
    for (int i = 0; i < garden.getPlants().size(); i++) {
      garden.getPlants().get(i).needsWater();
    }


  }
}
