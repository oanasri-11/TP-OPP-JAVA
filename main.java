
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
        
        ManageZones.AddZone(zone1);

        System.out.println("name of the zone : " + zone1.getName() + " , code of the zone : " + zone1.getCode() + " , status of the zone : " + zone1.getStatus() + " , longitude : " + zone1.getLongitude() + " , latitude : " + zone1.getLatitude());
  
        
           ManageSensors.addSensor(SensorType.biometricSensor, zone1 ,30.0, 40.0);
           zone1.displaysensorinfo();
           

           List<Crop> crops = new ArrayList<Crop>();
           crops.add(new Crop("12/03/2003","14/06/2003"));


            


       // Geographicalzone[] zones = new Geographicalzone[5];
        /*zones[0] = new Cropszone("potato zone" , 56.5 , 42.75);
        zones[1] = new Cropszone("tomate zone" , 52.1 , 46.5);
        zones[2] = new Poultry("poultry 1 zone" , 50.0 , 62.0);
        zones[3] = new Ruminates("ruminate 1 zone" , 51.2 , 36.7);
        zones[4] = new Aquaculturezone("fishs zone" , 46 , 96.7);
*/


    }

    
}