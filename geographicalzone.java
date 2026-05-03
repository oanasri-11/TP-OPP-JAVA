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

  public int getCode(){
      return code;
  }


  abstract void addSensor(SensorType type , double min , double max ) throws WrongTypeSensorException;
  abstract void displayReadings();
  
}