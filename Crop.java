
import java.time.LocalDate;

public class Crop {

  private Cropsfamilies family;
  private LocalDate Plantingdate;
  private LocalDate Harvestingdate;
  private GrowthStage growthStage;
  private SoilRequirments soilReq;
  
  public Crop(LocalDate Plantingdate, LocalDate Harvestingdate){
    this.Plantingdate=Plantingdate;
    this.Harvestingdate=Harvestingdate;

  
  }
  public String getGrowthStage(){
  return growthStage.toString();

}

public String getFamily(){
  return family.toString();
}

public String getSoilReq(){
  return soilReq.toString();
}
public void setFamily(Cropsfamilies family){
  this.family = family;
}
public void setSoilReq(SoilRequirments soilReq){
  this.soilReq = soilReq;
}
public void setPlantingdate(LocalDate Plantingdate){
  this.Plantingdate = Plantingdate;
}









public void updategrowthstage(LocalDate cdate){
  this.growthStage = GrowthStage.getGrowthStage(Plantingdate, Harvestingdate, cdate);
}
public void displaystatus(){
  System.out.println("Crop family : " + family);
  System.out.println("Planting date : " + Plantingdate);
  System.out.println("Harvesting date : " + Harvestingdate);
  System.out.println("Current growth stage : " + growthStage);
  System.out.println("Soil requirements : " + soilReq);
}


public void generatecropstatus(){
  for (Crop c:crop_fields){
    c.displaystatus();
  }
}

}