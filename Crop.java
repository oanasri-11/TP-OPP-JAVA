
import java.time.LocalDate;

public class Crop {

  private Cropsfamilies family;
  private LocalDate Plantingdate;
  private LocalDate Harvestingdate;
  private GrowthStage growthStage;
  private SoilRequirments soilReq;
  private EnviroSensor envSensor;
  private SoilSensor soilSensor;
  
  public Crop(LocalDate Plantingdate, LocalDate Harvestingdate){
    this.Plantingdate=Plantingdate;
    this.Harvestingdate=Harvestingdate;
  }

  
}