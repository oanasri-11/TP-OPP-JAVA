public class Thershold {
    
    private double minValue ;
    private double maxValue ;

    public Thershold(double min , double max){
        this.minValue = min;
        this.maxValue = max;
    }

    public boolean isinRange(double x){
        return x >= minValue && x <= maxValue ;
    }
    public double getMin() {
        return minValue;
    }
    public double getMax() {
        return maxValue;
    }
     public void setMin(double minValue) {
        this.minValue = minValue;}
        public void setMax(double maxValue) {
         this.maxValue = maxValue;

}
}
