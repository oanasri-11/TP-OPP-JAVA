public class SoilSensor extends Sensor {
  
  private double PH;
  private double moisturelevel;
  private double nitrogencontent;

    public SoilSensor(Geographicalzone zone , double min , double max){
        super(zone , min , max);
    }

  public double getPH() {
    return PH;
  }
  public double getMoisturelevel() {
    return moisturelevel;
  }
  public double getNitrogencontent() {
    return nitrogencontent;
  }
  public void setPH(double PH){
    this.PH=PH;

  }
  public void setMoisturelevel(double moisturelevel){
    this.moisturelevel=moisturelevel;
  }
  public void setNitrogencontent(double nitrogencontent){
    this.nitrogencontent=nitrogencontent;
  }

  public void displayReading(){
    System.out.println("Soil Sensor #" + code +" of crop zone #"+ zone.getCode()+" :" );
    System.out.println(" - PH : "+PH );
    System.out.println(" - Moisture level : " + moisturelevel );
    System.out.println(" - Nistrogen content : "+ nitrogencontent );

  }

}