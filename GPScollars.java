public class GPScollars extends Sensor{

  private double latitude;
  private double longitude;
  
  public GPScollars(Geographicalzone zone , double min , double max){
    super(zone, min , max);
  }

    public void displayReading(){
        System.out.println("Biometric Sensor #" + code +" of Livestock zone #"+ zone.getCode()+" :" );
        System.out.println(" - latitude : "+latitude );
        System.out.println(" - longitude : "+longitude );
    }

}