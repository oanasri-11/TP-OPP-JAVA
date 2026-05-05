public abstract  class Geographicalzone {
  
  static int numZones = 0;

  protected  int code;
  protected  String name;
  protected  ZoneStatus status;
  protected  ProductionRecord record ;

  protected double longitude;
  protected double latitude;

  
  public Geographicalzone(String name , double L , double l) {
    numZones ++ ;
    this.name = name;
    longitude = L;
    latitude = l;
    this.code = numZones;
  }

  public int getCode(){
      return code;
  }

  public double getLongitude(){
    return longitude;
  }

  public double getLatitude(){
    return latitude;
  }


  abstract void addSensor(SensorType type , double min , double max ) throws WrongTypeSensorException;
  abstract void displayReadings();
  
}