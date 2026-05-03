
import java.util.ArrayList;
import java.util.List;

abstract public  class Livestockzone extends Geographicalzone{

private List<BiometricSensor> bioSensors ;
private List<GPScollars> gpsCollars ;

private  List<Animal> animals;
private FeedingProg feedProg ;

public Livestockzone(String name) {
    super(name);
    animals = new ArrayList<>();
    bioSensors = new ArrayList<>();
    gpsCollars = new ArrayList<>();
  }

  public void addSensor(SensorType type , double min , double max) throws WrongTypeSensorException{
        switch(type){
            case biometricSensor :
                bioSensors.add(new BiometricSensor(this , min , max));
                break;
            
            case gpsCollars :
                gpsCollars.add(new GPScollars(this , min , max));
                break;
            
            default :
                throw new WrongTypeSensorException();
                
        }
    }


  public void displayReadings(){

      for(BiometricSensor s : bioSensors){
        s.displayReading();
      }

      for(GPScollars s : gpsCollars){
        s.displayReading();
      }

  }

}