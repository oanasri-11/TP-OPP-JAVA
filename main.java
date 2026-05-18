
public class main {

    public static void main(String[] args){
        /*
        Animal animal1 = new Animal(5, 10.5, Healthstatus.HEALTHY) ;
        animal1.displayInfo();
        Animal animal2 = new Animal(6, 15.5, Healthstatus.HEALTHY) ;
        animal2.displayInfo();
        Animal animal3 = new Animal(3, 10.5, Healthstatus.SICK) ;
        animal3.displayInfo();

        Livestockzone zone1 = new Poultry("Livestock Zone 1", 50.0, 60.0);
        zone1.registerAnimal(5, 10.5, Healthstatus.HEALTHY);
        zone1.displayOverView();
        
        ManageZones.AddZone(zone1);
        */

        Cropszone zone2 = new Cropszone("tomate zone" , 16.0 , 18.5);
        Cropszone zone3 = new Cropszone("potato zone" , 22.0 , 16.5);

        ManageZones.AddZone(zone2);
        ManageZones.AddZone(zone3);


        ManageSensors.addSensor(SensorType.enviroSensor, zone2, 12, 16);
        ManageSensors.addSensor(SensorType.soilSensor, zone2, 11, 13.25);
        ManageSensors.addSensor(SensorType.enviroSensor, zone3, 16, 17.5);
        ManageSensors.addSensor(SensorType.soilSensor, zone3, 10, 16);

            

       // Geographicalzone[] zones = new Geographicalzone[5];
        /*zones[0] = new Cropszone("potato zone" , 56.5 , 42.75);
        zones[1] = new Cropszone("tomate zone" , 52.1 , 46.5);
        zones[2] = new Poultry("poultry 1 zone" , 50.0 , 62.0);
        zones[3] = new Ruminates("ruminate 1 zone" , 51.2 , 36.7);
        zones[4] = new Aquaculturezone("fishs zone" , 46 , 96.7);
<<<<<<< HEAD

        ((Cropszone) zones[0]).addcrop(new Crop("12-09-2025" , "06-07-2026"));
        Cropszone zone1 = (Cropszone) zones[0];
        zone1.displayOverView();
=======
*/


    }

    
}