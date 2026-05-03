

public class BiometricSensor extends Sensor{


    private double bodytemperature;
    private double activitylevel;  // in steps per minute


    public BiometricSensor( Geographicalzone zone , double min , double max){
        super(zone , min , max);
    }



}