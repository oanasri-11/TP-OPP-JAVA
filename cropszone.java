
import java.util.ArrayList;
import java.util.List;

public class Cropszone extends Geographicalzone{
    
    
    private List<EnviroSensor> envSensors;
    private List<SoilSensor> soilSensors;

    private List<Crop> crop_fields ;
    

    public Cropszone(String name) {
        super(name);
        crop_fields = new ArrayList<>();
        envSensors = new ArrayList<>();
        soilSensors = new ArrayList<>();
    }

    public void addSensor(Sensor s){

    }

}