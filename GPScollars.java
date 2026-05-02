public class GPScollars extends Sensor{
  private double latitude;
  private double longitude;
  
  public GPScollars(String code , Geographicalzone zone ,double latitude,double longitude){
    super(code, zone);
    this.latitude=latitude;
    this.longitude=longitude;
  }


}