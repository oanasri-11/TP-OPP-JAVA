
import java.util.ArrayList;
import java.util.List;

public class ManageSensors{

    private List<Sensor> sensors;

    public ManageSensors() {
        sensors = new ArrayList<>();
    }

    public void addSensor(SensorType type , Geographicalzone zone , double min , double max){
        try{
            zone.addSensor(type, min, max);
        }
        catch(WrongTypeSensorException e){
            System.out.println("The type of this Sensor is not special for given zone");
        }
    }

    public void displayDashboardOfZone(Geographicalzone zone){
        zone.displayReadings();
    }

}