public class EnviroSensor extends Sensor {

    private double temperature;
    private double humidity;
    private double rainfall;
  
    public EnviroSensor( Geographicalzone zone  , double min , double max){
        super(zone , min , max);
    }
}