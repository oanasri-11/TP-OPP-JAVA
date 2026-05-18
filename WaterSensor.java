public class WaterSensor extends Sensor{
  
    private double temperature;
    private double dissolvedOxygen;

    public WaterSensor(Geographicalzone zone , double min , double max){
        super(zone, min , max);
        type = SensorType.waterSensor;
    }

    public void displayReading(){
        System.out.println("Water Sensor #" + code +" of Aquaculture zone #"+ zone.getCode()+" :" );
        System.out.print(" - temperature : "+temperature );
        System.out.println(" - dissolved Oxygen : "+dissolvedOxygen );

    }

    public void sendReading(){
        Readings read = new Readings(temperature ,range , zone , this);
        readingsHistory.add(read);
        read = new Readings(dissolvedOxygen ,range , zone , this);
        readingsHistory.add(read);
    }

}