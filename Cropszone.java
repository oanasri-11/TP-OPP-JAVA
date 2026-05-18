
import java.util.ArrayList;
import java.util.List;

public class Cropszone extends Geographicalzone{
    
    
    private List<EnviroSensor> envSensors;
    private List<SoilSensor> soilSensors;

    private List<Crop> crop_fields ;
   // private List<Crop> crops=new Arraylist<Crop>();
    

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

    public void addSensor(SensorType type , Sensor s) throws WrongTypeSensorException{
      
      switch(s.getType()){
          case enviroSensor :
              envSensors.add((EnviroSensor) s);
              break;
          
          case soilSensor :
              soilSensors.add((SoilSensor) s);
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

  public void addCrop(Crop c){
      crop_fields.add(c);
  }

  public void displayOverView(){
    System.out.println("Zone #"+ getCode() );
    System.out.println("Status : " + status.toString());
    System.out.println("Number of enviromental sensors : " + envSensors.size());
    System.out.println("Number of soil sensors : " + soilSensors.size());
    System.out.println("Number of crop fields : " + crop_fields.size());
  }

  public double getTotalCropYield(){
    double result = 0.0 ;
    for(Crop crop : crop_fields){
      result += crop.getCropYield();
    }
    return result;
  }


  public void recordProduction(double yieldAmount){
    record.recordCropYield(getTotalCropYield());
  }

  public void deactivate(){
    this.status = ZoneStatus.SUSPENDED;
    for(Sensor s : envSensors){
      s.setStatus(SensorStatus.Suspended);
    }

    for(Sensor s : soilSensors){
      s.setStatus(SensorStatus.Suspended);
    }
  }

  public void generateCropStatus(){
  for (Crop c:crop_fields){
    c.displaystatus();
  }
}



}
