
import java.util.List;

public class Cropszone extends Geographicalzone{
    
    private List<Crop> crop_fields ;
    private EnviroSensor envSensor;
    private SoilSensor soilSendor ;
    

    public Cropszone(String name, String code) {
        super(name, code);
    }

}