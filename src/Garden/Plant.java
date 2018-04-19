package Garden;

public class Plant {
  private int needsWater;
  private double absorbingCapability;
  private double waterlevel;
  private String color;

  public Plant(String color) {
    this.color = color;
  }
  public void needsWater(){
    if (waterlevel < needsWater){
      System.out.println("The " + color + " " + this.getClass().getSimpleName() + " needs water");
    } else {
      System.out.println("The " + color + " " + this.getClass().getSimpleName() + " doesnt need water");
    }
  }

  public void getWater (int water) {
    waterlevel = water * absorbingCapability;
  }

  public void setNeedsWater(int needsWater) {
    this.needsWater = needsWater;
  }

  public void setAbsorbingCapability(double absorbingCapability) {
    this.absorbingCapability = absorbingCapability;
  }

  public void setWaterlevel(double waterlevel) {
    this.waterlevel = waterlevel;
  }

  public int getNeedsWater() {

    return needsWater;
  }

  public double getWaterlevel() {
    return waterlevel;
  }
}
