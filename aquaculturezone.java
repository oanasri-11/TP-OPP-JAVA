
import java.util.ArrayList;
import java.util.List;

public class Aquaculturezone extends Geographicalzone{
   

private List<WaterSensor> waterSensor;
private int numAnimals;
private AnimalSpecie specie ;
private FeedingProg feedProg ;


public Aquaculturezone(String name) {
    super(name);
    waterSensor = new ArrayList<>();
  }

}