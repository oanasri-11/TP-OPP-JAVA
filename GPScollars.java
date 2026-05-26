public class GPScollars extends Sensor{

  private double latitude = 12.0;
  private double longitude = 13.2;
  private Animal animal;
  
  public GPScollars(Geographicalzone zone , double min , double max){
    super(zone, min , max);
    type = SensorType.gpsCollars;
  }

    public void displayReading(){
        System.out.println("Biometric Sensor #" + code +" of Livestock zone #"+ zone.getCode()+" :" );
        System.out.println(" - latitude : "+latitude );
        System.out.println(" - longitude : "+longitude );
    }

    public void sendReading(){
        ReadingPosition read = new ReadingPosition(longitude , latitude , new Thershold(0.0 , zone.getLongitude()) , new Thershold(0.0 , zone.getLatitude()) , zone , this);
        readingsHistory.add(read);
    }

    public Animal getAnimal(){
      return animal;
    }

    public void setAnimal(Animal a){
      this.animal = a;
      a.setGPScollars(this);
    }
  

}