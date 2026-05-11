
import java.util.ArrayList;
import java.util.List;

public class Aquaculturezone extends Geographicalzone{
   

private List<WaterSensor> waterSensors;
private List<Animal> aquacultureSpecies ;
private AnimalSpecie specie ;
private FeedingProg feedProg ;


public Aquaculturezone(String name , double L , double l) {
    super(name , L , l);
    waterSensors = new ArrayList<>();
    aquacultureSpecies = new ArrayList<>();
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
  public void addAnimal(Animal a){
      aquacultureSpecies.add(a);
  }
    public void setFeedingProg(FeedingProg f){
        feedProg = f;
    }
    
    public void deactivate(){
        this.status = ZoneStatus.SUSPENDED;
        for(Sensor s : waterSensors){
            s.setStatus(SensorStatus.Suspended);
        }
    }

    public void recordProduction(double value){};

    public void displayOverView(){
        System.out.println("animal specie of this zone : " + specie.name());
        System.out.println("Number of aquaculture species : " + aquacultureSpecies.size());
        System.out.println("Number of water sensors : " + waterSensors.size());
        System.out.println("Feeding program of this aquaculture zone : ");
        feedProg.displayFeedingProg();
    }


}