public class BiometricSensor extends Sensor{

    private double bodytemperature;
    private double activitylevel;  // in steps per minute


    public BiometricSensor(String code , Geographicalzone zone){
        super(code, zone);
    }

}