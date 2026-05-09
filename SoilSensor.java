public class SoilSensor extends Sensor {
  
  private double PH;
  private int moisturelevel;
  private double nitrogencontent;

    public SoilSensor(Geographicalzone zone , double min , double max){
        super(zone , min , max);
    }

  public double getPH() {
    return PH;
  }
  public int getMoisturelevel() {
    return moisturelevel;
  }
  public double getNitrogencontent() {
    return nitrogencontent;
  }
  public void setPH(double PH){
    this.PH=PH;

  }
  public void setMoisturelevel(int moisturelevel){
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

  public void sendReading(){
      Readings read = new Readings(PH ,range , zone);
      readingsHistory.add(read);
      read = new Readings(moisturelevel ,range , zone);
      readingsHistory.add(read);
      read = new Readings(nitrogencontent ,range , zone);
      readingsHistory.add(read);
  }


}