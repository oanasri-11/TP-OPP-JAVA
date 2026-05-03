public class EnviroSensor extends Sensor {

    private double temperature;
    private double humidity;
    private double rainfall;
  
    public EnviroSensor(String code , Geographicalzone zone  , double min , double max){
        super(code, zone , min , max);
    }
}