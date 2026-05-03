public class WaterSensor extends Sensor{
  
    private double temperature;
    private double dissolvedOxygen;

    public WaterSensor(Geographicalzone zone , double min , double max){
        super(zone, min , max);
    }



}