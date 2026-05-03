public class ReadingPosition extends Readings {

    private double y = 0;


    public double getXvalue(){
        return x;
    }

    public double getYvalue(){
        return y;
    }

    public void setPosition(double x , double y){
        this.x = x;
        this.y = y;
    }

}