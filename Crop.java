

public class Crop {

  private Cropsfamilies family;
  private String Plantingdate;
  private String Harvestingdate;
  private GrowthStage growthStage;
  private SoilRequirments soilReq;
  private double cropYield;
  
  public Crop(Cropsfamilies family , String Plantingdate, String Harvestingdate , SoilRequirments req){
    this.family = family;
    this.Plantingdate=Plantingdate;
    this.Harvestingdate=Harvestingdate;
    this.soilReq = req;
  
  }

public double getCropYield(){
  return cropYield;
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
public void setPlantingdate(String Plantingdate){
  this.Plantingdate = Plantingdate;
}


public void updategrowthstage(){
  switch(growthStage){
    case SOWING :
      growthStage = GrowthStage.GERMINATION ;
      break;
    case GERMINATION :
      growthStage = GrowthStage.GROWTH ;
      break;
    case GROWTH :
      growthStage = GrowthStage.MATURITY ;
      break;
    case MATURITY :
      growthStage = GrowthStage.HARVEST ;
      break;
  }
}

public void displaystatus(){
  System.out.println("Crop family : " + family.toString());
  System.out.println("Planting date : " + Plantingdate);
  System.out.println("Harvesting date : " + Harvestingdate);
  System.out.println("Current growth stage : " + growthStage.toString());
  System.out.println("Soil requirements : " + soilReq);
}

public void displayCurrentGrowthStage(){
  System.out.println("Current growth stage : " + growthStage.toString());
}

}