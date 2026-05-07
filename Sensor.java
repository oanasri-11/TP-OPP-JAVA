
import java.util.ArrayList;
import java.util.List;

public abstract class Sensor{
  
  static private List<Sensor> sensors = new ArrayList<>();
  static int numSensors = 0;

  protected SensorStatus status = SensorStatus.Acitve;
  protected int code;
  protected Geographicalzone zone;
  protected Thershold range ;
  protected List<Readings> readingsHistory;

  public Sensor(  Geographicalzone zone , double min , double max){
    numSensors ++;
    this.code = numSensors;
    this.zone = zone;
    range = new Thershold(min , max);
    readingsHistory = new ArrayList<>();
    sensors.add(this);
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

  public SensorStatus getStatus(){
    return status;
  }
  
  public void setStatus(SensorStatus st){
     this.status = st ;
  }

  public List<Readings> getReadingsHistory(){
    return readingsHistory;
  }
  
  abstract void displayReading();
  abstract void sendReading();

}