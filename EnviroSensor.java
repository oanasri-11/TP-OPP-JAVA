public class EnviroSensor extends Sensor {

    private double temperature;
    private double humidity;
    private double rainfall;
  
    public EnviroSensor( Geographicalzone zone  , double min , double max){
        super(zone , min , max);
    }

    public void displayReading(){
        System.out.println("Environmental Sensor #" + code +" of crop zone #"+ zone.getCode()+" :" );
        System.out.println(" - temperature : "+temperature );
        System.out.println(" - humidity : "+humidity );
        System.out.println(" - rainfall : "+rainfall );
    }

}