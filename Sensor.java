
import java.util.ArrayList;
import java.util.List;

public abstract class Sensor{
  
  static int numSensors = 0;

  private SensorStatus status = SensorStatus.Acitve;
  private int code;
  private Geographicalzone zone;
  private Thershold range ;
  private List<Readings> readingsHistory;

  public Sensor(  Geographicalzone zone , double min , double max){
    numSensors ++;
    this.code = numSensors;
    this.zone = zone;
    range = new Thershold(min , max);
    readingsHistory = new ArrayList<>();
  }

  public int getCode() {
    return code;
  }
  
  public Geographicalzone getZone() {
    return zone;
  }

  public void setZone(Geographicalzone zone) {
    this.zone = zone;
  }
  
  public List<Readings> getReadingsHistory(){
    return readingsHistory;
  }
  
}