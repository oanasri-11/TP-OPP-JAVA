import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ManageZones{

static private  List<Geographicalzone> zones = new ArrayList<>();

public static List<Geographicalzone> getZones(){
      return zones;
  }

    static public void AddZone(Geographicalzone zone){
        zones.add(zone);

    }

    static public void AddZone(ZoneType type , String name , double L , double l){

        switch(type){
            case aquaculturezone :
                zones.add(new Aquaculturezone(name , L , l));
            break;

            case cropszone :
                zones.add(new Cropszone(name , L , l));
            break;

            case Poultryzone :
                zones.add(new Poultryzone(name , L , l));
            break;

            case ruminateszone :
                zones.add(new Ruminateszone(name , L , l));
            break;
        }

    }


    public void addCrop(Cropszone zone , Crop c){
        zone.addCrop(c);
    }

    public void addAnimal(Geographicalzone zone , Animal animal) throws WrongTypeZoneException , WrongAnimalSpecieException{

        switch(zone.getType()){

            case Poultryzone :
                ((Poultryzone) zone).addAnimal(animal);
                break;

            case ruminateszone :
                ((Ruminateszone) zone).addAnimal(animal);
                break;

            case aquaculturezone :
                ((Aquaculturezone) zone).addAnimal(animal);
                break;
                
            default : 
                throw new WrongTypeZoneException();
            }
    }

    static public void editZone(Geographicalzone zone , String name){
        zone.edit(name);
    }
    
    static public void editZone(Geographicalzone zone , double L , double l){
        zone.edit(L , l);
    }

    static public void editZone(Geographicalzone zone , String name , double L , double l){
        zone.edit(name);
        zone.edit(L , l);
    }



    static public void deactivateZone(Geographicalzone zone){
        zone.deactivate();
    }

    public void displayOverviewAllZones(){
        Iterator it = zones.iterator();
        while(it.hasNext()){
            Geographicalzone zone = (Geographicalzone) it.next();
            zone.displayOverView();
        }
    }


}