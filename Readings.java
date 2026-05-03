
import java.util.Date;

public class Readings{
    
    protected  double x = 0;
    protected Date date;

    public Readings() {
        date = new Date();
        
    }

    

    public double getValue(){
        return x;
    }

    public void generateAlert(){

    }

}