
import java.util.ArrayList;
import java.util.List;

public class Aquaculturezone extends Geographicalzone{
   

private List<WaterSensor> waterSensors;
private int numAnimals;
private AnimalSpecie specie ;
private FeedingProg feedProg ;


public Aquaculturezone(String name , double L , double l) {
    super(name , L , l);
    waterSensors = new ArrayList<>();
  }


  public void addSensor(SensorType type , double min , double max) throws WrongTypeSensorException{
        switch(type){
            case waterSensor :
                waterSensors.add(new WaterSensor(this , min , max));
                break;
            
            default :
                throw new WrongTypeSensorException();
                
        }
    }

  public void displayReadings(){
      for(WaterSensor s : waterSensors){
        s.displayReading();
      }
  }


}