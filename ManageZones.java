import java.util.ArrayList;
import java.util.List;


public class ManageZones{
static private  List<Geographicalzone> zones = new ArrayList<>();
public static List<Geographicalzone> getZones(){
      return zones;
  }

    static public void AddZone(Geographicalzone zone){
        zones.add(zone);

    }


}