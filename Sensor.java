public abstract class Sensor{
  String private uniquecode;
  Boolean private islocated;

  public Sensor( String uniquecode,Boolean islocated){
    this.uniquecode=uniquecode;
    this.islocated=islocated;

  }
  public String getUniquecode() {
    return uniquecode;
  }
  
  public String getIslocated() {
    return islocated;
  }
  public void setUniquecode(String uniquecode) {
    this.uniquecode = uniquecode;
  }
  public void setIslocated(Boolean islocated) {
    this.islocated = islocated;
  }
  
  
}