
import java.util.ArrayList;
import java.util.List;

abstract public  class Livestockzone extends Geographicalzone{

private  List<Animal> animals;
private FeedingProg feedProg ;

public Livestockzone(String name, String code) {
    super(name, code);
    animals = new ArrayList<>();
  }

}