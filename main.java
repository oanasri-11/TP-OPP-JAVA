
import java.util.*;
public class main {

    public static void main(String[] args){

        Animal animal1 = new Animal(5, 10.5, Healthstatus.HEALTHY) ;
        animal1.displayInfo();
        Animal animal2 = new Animal(6, 15.5, Healthstatus.HEALTHY) ;
        animal2.displayInfo();
        Animal animal3 = new Animal(3, 10.5, Healthstatus.SICK) ;
        animal3.displayInfo();

        Livestockzone zone1 = new Poultry("Livestock Zone 1", 50.0, 60.0);
        zone1.registerAnimal(5, 10.5, Healthstatus.HEALTHY);
       // zone1.displayOverView();
        
        //ManageZones.AddZone(zone1);

        System.out.println("name of the zone : " + zone1.getName() + " , code of the zone : " + zone1.getCode() + " , status of the zone : " + zone1.getStatus() + " , longitude : " + zone1.getLongitude() + " , latitude : " + zone1.getLatitude());
  
        
          ///// ManageSensors.addSensor(SensorType.biometricSensor, zone1 ,30.0, 40.0);
           ///zone1.displaysensorinfo();
           

           List<Crop> crops = new ArrayList<Crop>();
           crops.add(new Crop("12/03/2003","14/06/2003"));
           crops.get(0).displaystatus();



            


       


    }

    
}