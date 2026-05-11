
import java.util.ArrayList;
import java.util.List;

abstract public  class Livestockzone extends Geographicalzone{

private List<BiometricSensor> bioSensors ;
private List<GPScollars> gpsCollars ;

private  List<Animal> animals ;
private FeedingProg feedProg ;

public Livestockzone(String name , double L , double l) {
    super(name , L  , l);
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
  public void addAnimal(Animal a){
      animals.add(a);
  }
  public void setFeedingProg(FeedingProg f){
      feedProg = f;
  }

  public void deactivate(){
    this.status = ZoneStatus.SUSPENDED;
    for(Sensor s : bioSensors){
      s.setStatus(SensorStatus.Suspended);
    }

    for(Sensor s : gpsCollars){
      s.setStatus(SensorStatus.Suspended);
    }

  }

  public void displayOverView(){
    System.out.println("Number of animals : " + animals.size());
    System.out.println("Number of biometric sensors : " + bioSensors.size());
    System.out.println("Number of GPScollars  : " + gpsCollars.size());
    System.out.println("************************");
  }
public void registerAnimal(int age, double weight, Healthstatus healthstatus){
    animals.add(new Animal(age, weight, healthstatus));
    }
    public void printanimalsInfo(){
        for(Animal a : animals){
            a.displayInfo();
        }
    }
    public void displaysensorinfo(){
        for(BiometricSensor s : bioSensors){
            s.displaysensorinfo();
        }

        for(GPScollars s : gpsCollars){
            s.displaysensorinfo();
        }
    }
  

}