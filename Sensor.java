public abstract class Sensor{
  
  static int numSensors = 0;

  private SensorStatus status ;
  private int code;
  private Geographicalzone zone;
  private Thershold range ;

  public Sensor(  Geographicalzone zone , double min , double max){
    numSensors ++;
    this.code = numSensors;
    this.zone = zone;
    range = new Thershold(min , max);
    
  }
  public int getCode() {
    return code;
  }
  
  public Geographicalzone  getZone() {
    return zone;
  }

  public void setZone(Geographicalzone zone) {
    this.zone = zone;
  }
  
  
}