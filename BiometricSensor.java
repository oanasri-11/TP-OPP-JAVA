

public class BiometricSensor extends Sensor{


    private double bodytemperature;
    private double activitylevel;  // in steps per minute
    private Animal animal;

  

    public BiometricSensor( Geographicalzone zone , double min , double max){
        super(zone , min , max);
    }
    

    public void displayReading(){
        System.out.println("Biometric Sensor #" + code +" of Livestock zone #"+ zone.getCode()+" :" );
        System.out.println(" - body temperature : "+bodytemperature );
        System.out.println(" - activity level : "+activitylevel );
    }

  public void sendReading(){
      Readings read = new Readings(bodytemperature ,range , zone , this);
      readingsHistory.add(read);
      read = new Readings(activitylevel ,range , zone , this);
      readingsHistory.add(read);
  }
  

  public Animal getAnimal(){
    return animal;
  }

  public void setAnimal(Animal a){
    this.animal = a;
  }


}