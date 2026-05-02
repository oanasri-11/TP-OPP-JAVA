public abstract class Sensor{
  
  private SensorStatus status ;
  private String code;
  private Geographicalzone zone;
  private Thershold range ;

  public Sensor( String code,Geographicalzone zone){
    this.code=code;
    this.zone = zone;
    
  }
  public String getCode() {
    return code;
  }
  
  public Geographicalzone  getZone() {
    return zone;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public void setZone(Geographicalzone zone) {
    this.zone = zone;
  }
  
  
}