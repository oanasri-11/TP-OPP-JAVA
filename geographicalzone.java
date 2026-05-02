public abstract  class Geographicalzone {
  
  protected  String code;
  protected  String name;
  protected  ZoneStatus status;


  public Geographicalzone(String name, String code) {
    this.name = name;
    this.code = code;
  }


  
}