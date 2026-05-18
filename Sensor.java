
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
  protected SensorType type;

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

  public SensorType getType(){
    return type;
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
  public Thershold getRange(){
    return range;
  }
  public double getMin(){
    return range.getMin();
  }
  public double getMax(){
    return range.getMax();
  }

  
  abstract void displayReading();
  abstract void sendReading();
  public void displaysensorinfo(){
    System.out.println("Sensor #" + code +" of zone #"+ zone.getCode()+" :" );
    System.out.println(" - Status : "+status );
    System.out.println(" - Range : " + range.getMin() + " to " + range.getMax() );
  
  }

}