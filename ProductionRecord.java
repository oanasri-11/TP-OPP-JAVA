public class ProductionRecord {

    private double milk_yield ;
    private int egg_count ;
    private double harvestWeight;
    private double corp_yield;


    public double getMilk_yield() {
        return milk_yield;
    }
    public int getEgg_count() {
        return egg_count;
    }
    public double getHarvestWeight() {
        return harvestWeight;
    }
    public double getCorp_yield() {
        return corp_yield;
    }
    public void setMilk_yield(double milk_yield) {
        this.milk_yield = milk_yield;
    }
    public void setEgg_count(int egg_count) {
        this.egg_count = egg_count;
    }
    public void setHarvestWeight(double harvestWeight) {
        this.harvestWeight = harvestWeight;
    }
    public void setCorp_yield(double corp_yield) {
        this.corp_yield = corp_yield;
    }
    
 public void recordMilkYield(double value){
     milk_yield = value;
 }
 public void recordEggCount(int value1){
     egg_count = value1;
 }
    public void recordHarvestWeight(double value2){
        harvestWeight = value2;
    }
    public void recordCropYield(double value3){
        corp_yield = value3;
    }

  
  
}
