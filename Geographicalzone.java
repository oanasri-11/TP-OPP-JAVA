public abstract class Geographicalzone {
  
  static int numZones = 0;

  protected ZoneType type ;
  protected  int code;
  protected  String name;
  protected  ZoneStatus status;
  protected  ProductionRecord record ;

  protected double longitude;
  protected double latitude;


  
  public Geographicalzone(String name , double longitude , double latitude) {
    numZones ++ ;
    this.name = name;
    this.status=ZoneStatus.ACTIVE;
    this.longitude = longitude;
    this.latitude = latitude;
    this.code = numZones;
    this.record = new ProductionRecord();
    //zones.add(this);
  }
  public void editzone(String name , double L , double l){
    this.name = name;
    longitude = L;
    latitude = l;
  }

  public void edit(String name ){
    this.name = name;
  }

  public void edit( double L , double l){
    longitude = L;
    latitude = l;
  }


  
  public abstract void displayOverView();
  public abstract void recordProduction(double value);
   

   public String getName(){
      return name;
  }

  public void setName(String name){
      this.name = name;
  }

  public String getStatus(){
      return status.toString();
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
  abstract void addSensor(SensorType type , Sensor s ) throws WrongTypeSensorException;
  abstract void displayReadings();
  abstract void deactivate();

  
}
