package Garden;

public class Tree extends Plant {

  public Tree(String color) {
    super(color);
    setWaterlevel(0);
    setNeedsWater(5);
    setAbsorbingCapability(0.4);
  }
}
