import java.util.ArrayList;
import java.util.List;
public abstract class Geographicalzone {
  
  static int numZones = 0;
 static private  List<Geographicalzone> zones = new ArrayList<>();
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
  abstract  void deactivate();
  
  public abstract void displayOverView();
  public abstract void recordProduction(double value);
   

   public String getName(){
      return name;
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
  public static List<Geographicalzone> getZones(){
      return zones;
  }


  abstract void addSensor(SensorType type , double min , double max ) throws WrongTypeSensorException;
  abstract void displayReadings();

  
}