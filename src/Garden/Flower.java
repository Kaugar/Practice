package Garden;

public class Flower extends Plant{

  public Flower(String color) {
    super(color);
    setAbsorbingCapability(0.75);
    setNeedsWater(5);
    setWaterlevel(0);
  }
}
