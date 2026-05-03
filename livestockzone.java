
import java.util.ArrayList;
import java.util.List;

abstract public  class Livestockzone extends Geographicalzone{

private List<BiometricSensor> bioSensors ;
private List<GPScollars> gpsSensors ;

private  List<Animal> animals;
private FeedingProg feedProg ;

public Livestockzone(String name) {
    super(name);
    animals = new ArrayList<>();
    bioSensors = new ArrayList<>();
    gpsSensors = new ArrayList<>();
  }



}