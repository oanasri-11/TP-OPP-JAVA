public abstract  class Geographicalzone {
  
  protected  String code;
  protected  String name;
  protected  ZoneStatus status;
  protected  ProductionRecord record ;
  

  public Geographicalzone(String name, String code) {
    this.name = name;
    this.code = code;
  }


  
}