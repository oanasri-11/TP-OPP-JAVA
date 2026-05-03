public class SoilSensor extends Sensor {
  
  private double PH;
  private double moisturelevel;
  private double nitrogencontent;

    public SoilSensor(String code , Geographicalzone zone , double min , double max){
        super(code, zone , min , max);
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

}