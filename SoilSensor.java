public class SoilSensor extends Sensor {
  
  private double PH = 5.0;
  private int moisturelevel = 6;
  private double nitrogencontent = 23.5;

    public SoilSensor(Geographicalzone zone , double min , double max){
        super(zone , min , max);
        type = SensorType.soilSensor;
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
      Readings read = new Readings(PH ,range , zone , this);
      readingsHistory.add(read);
      read = new Readings(moisturelevel ,range , zone , this);
      readingsHistory.add(read);
      read = new Readings(nitrogencontent ,range , zone , this);
      readingsHistory.add(read);
  }


}