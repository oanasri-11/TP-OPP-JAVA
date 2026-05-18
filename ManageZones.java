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


    static public void editZone(Geographicalzone zone , String name){
        zone.edit(name);
    }
    
    static public void editZone(Geographicalzone zone , double L , double l){
        zone.edit(L , l);
    }


    static public void deactivateZone(Geographicalzone zone){
        zone.deactivate();
    }


}