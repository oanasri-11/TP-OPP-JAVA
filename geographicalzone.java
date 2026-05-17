public abstract  class Geographicalzone {
  
  static int numZones = 0;

  protected  int code;
  protected  String name;
  protected  ZoneStatus status;
  protected  ProductionRecord record ;

  protected double longitude;
  protected double latitude;


  
  public Geographicalzone(String name , double longitude , double latitude) {
    numZones ++ ;
    this.name = name;
    this.longitude = longitude;
    this.latitude = latitude;
    this.code = numZones;
    this.record = new ProductionRecord();
  }
  public void editzone(String name , double L , double l){
    this.name = name;
    longitude = L;
    latitude = l;
  }

  public void editzone(String name ){
    this.name = name;
  }

  public void editzone( double L , double l){
    longitude = L;
    latitude = l;
  }


  abstract  void deactivate();
  
  public abstract void displayOverView();
  public abstract void recordProduction(double value);

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