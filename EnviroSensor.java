public class EnviroSensor extends Sensor {

    private double temperature = 37.2;
    private double humidity = 5.0;
    private double rainfall = 23.0;
  
    public EnviroSensor( Geographicalzone zone  , double min , double max){
        super(zone , min , max);
        type = SensorType.enviroSensor;
    }

    public void displayReading(){
        System.out.println("Environmental Sensor #" + code +" of crop zone #"+ zone.getCode()+" :" );
        System.out.println(" - temperature : "+temperature );
        System.out.println(" - humidity : "+humidity );
        System.out.println(" - rainfall : "+rainfall );
    }

  public void sendReading(){
      Readings read = new Readings(temperature ,range , zone , this);
      readingsHistory.add(read);
      read = new Readings(humidity ,range , zone , this);
      readingsHistory.add(read);
      read = new Readings(rainfall ,range , zone , this);
      readingsHistory.add(read);
  }


}