public class WaterSensor extends Sensor{
  
    private double temperature;
    private double dissolvedOxygen;

    public WaterSensor(Geographicalzone zone , double min , double max){
        super(zone, min , max);
    }

    public void displayReading(){
        System.out.println("Water Sensor #" + code +" of Aquaculture zone #"+ zone.getCode()+" :" );
        System.out.println(" - temperature : "+temperature );
        System.out.println(" - dissolved Oxygen : "+dissolvedOxygen );

    }

}