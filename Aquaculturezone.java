
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
    type = ZoneType.aquaculturezone;
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

    public void addSensor(SensorType type , Sensor s) throws WrongTypeSensorException{
        switch(s.getType()){
            case waterSensor :
                waterSensors.add((WaterSensor) s);
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
  public void addAnimal(Animal a) throws WrongAnimalSpecieException{
      if( a.getSpecie() != specie) throw new WrongAnimalSpecieException();  
      a.setZone(this);
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

  public double getHarvestWeight(){
    double result = 0.0 ;
    for(Animal a : aquacultureSpecies){
        result += a.getWeight();
    }
    return result;
  }  

  public void recordProduction(double yieldAmount){

            
            this.record.recordHarvestWeight(getHarvestWeight());
            System.out.println("Production recorded: " + yieldAmount + " units for zone " + this.name);

            record.recordHarvestWeight(getHarvestWeight());
  }

    public void displayOverView(){
        System.out.println("Zone #"+ getCode() );
        System.out.println("\tStatus : " + status.toString());
        System.out.println("\tanimal specie of this zone : " + specie.name());
        System.out.println("\tNumber of aquaculture species : " + aquacultureSpecies.size());
        System.out.println("\tNumber of water sensors : " + waterSensors.size());
    }

}
