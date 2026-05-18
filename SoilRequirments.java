public class SoilRequirments{

    private Thershold PHrange;
    private Thershold soilMastureRange ;



    public SoilRequirments(Thershold PHrange, Thershold soilMastureRange){
        this.PHrange = PHrange;
        this.soilMastureRange = soilMastureRange;
    }
   
    
    public String getPHrange(){
        return PHrange.toString();
    }
    public String getSoilMastureRange(){
        return soilMastureRange.toString();
    }
    public void setPHrange(Thershold PHrange){
        this.PHrange = PHrange;
    }
    public void setSoilMastureRange(Thershold soilMastureRange){
        this.soilMastureRange = soilMastureRange;
    }

  
}