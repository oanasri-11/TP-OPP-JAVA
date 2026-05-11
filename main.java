

public class main {

    public static void main(String[] args){

        Animal animal1 = new Animal(5, 10.5, Healthstatus.HEALTHY) ;
        animal1.displayInfo();
        Animal animal2 = new Animal(6, 15.5, Healthstatus.HEALTHY) ;
        animal2.displayInfo();
        Animal animal3 = new Animal(3, 10.5, Healthstatus.SICK) ;
        animal3.displayInfo();


        Geographicalzone[] zones = new Geographicalzone[10];
        zones[0] = new Cropszone("potato zone" , 56.5 , 42.75);
        zones[1] = new Cropszone("tomate zone" , 52.1 , 46.5);
        zones[2] = new Poultry("poultry 1 zone" , 50.0 , 62.0);
        zones[3] = new Ruminates("ruminate 1 zone" , 51.2 , 36.7);
        zones[4] = new Aquaculturezone("fishs zone" , 46 , 96.7);

        ((Cropszone) zones[0]).addcrop(new Crop("12-09-2025" , "06-07-2026"));



    }

    
}