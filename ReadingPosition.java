public class ReadingPosition extends Readings {

    private double y = 0;


    public ReadingPosition(double x , double y , Thershold range , Thershold range2){
        super(x , range);
        this.y = y;
        if(!range2.isinRange(y)){
            generateAlert();
        }
    }

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