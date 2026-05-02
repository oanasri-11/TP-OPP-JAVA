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

}
