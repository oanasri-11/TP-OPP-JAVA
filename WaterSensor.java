public class WaterSensor extends Sensor{
  
    private double temperature;
    private double dissolvedOxygen;

    public WaterSensor(String code , Geographicalzone zone , double min , double max){
        super(code, zone, min , max);
    }



}