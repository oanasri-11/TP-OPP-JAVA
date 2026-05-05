
import java.util.ArrayList;
import java.util.List;

public class Cropszone extends Geographicalzone{
    
    
    private List<EnviroSensor> envSensors;
    private List<SoilSensor> soilSensors;

    private List<Crop> crop_fields ;
    

    public Cropszone(String name , double L , double l) {
        super(name , L , l);
        crop_fields = new ArrayList<>();
        envSensors = new ArrayList<>();
        soilSensors = new ArrayList<>();
    }

    public void addSensor(SensorType type , double min , double max) throws WrongTypeSensorException{
        switch(type){
            case enviroSensor :
                envSensors.add(new EnviroSensor(this , min , max));
                break;
            
            case soilSensor :
                soilSensors.add(new SoilSensor(this , min , max));
                break;
            
            default :
                throw new WrongTypeSensorException();
                
        }
    }

  public void displayReadings(){
      for(EnviroSensor s : envSensors){
        s.displayReading();
      }

      for(SoilSensor s : soilSensors){
        s.displayReading();
      }
  }


}