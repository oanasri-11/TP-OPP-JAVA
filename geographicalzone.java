public abstract  class Geographicalzone {
  
  static int numZones = 0;

  protected  int code;
  protected  String name;
  protected  ZoneStatus status;
  protected  ProductionRecord record ;

  
  public Geographicalzone(String name) {
    numZones ++ ;
    this.name = name;
    this.code = numZones;
  }


  abstract void addSensor(Sensor s);

  
}