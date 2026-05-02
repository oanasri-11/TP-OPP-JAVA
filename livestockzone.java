
import java.util.List;

abstract public  class Livestockzone extends Geographicalzone{

private List<Animal> animals;
private BiometricSensor bioSensor;
private GPScollars gpsSensor ;


public Livestockzone(String name, String code) {
    super(name, code);
  }

}