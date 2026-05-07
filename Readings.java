
import java.util.Date;

public class Readings{

    static private int numReading = 0;
    
    private int code ;
    protected  double x = 0;
    protected Date date;

    public Readings(){
        numReading ++;
        code = numReading;
        date = new Date();
    }

    public Readings(double x , Thershold range) {
        numReading ++;
        code = numReading;
        date = new Date();
        this.x = x;
        if(!range.isinRange(x)){
            Alert.generateAlert(this);
        }
    }

    public Date getDate(){
        return date;
    }

    public double getValue(){
        return x;
    }

    public void  setValue(double x){
        this.x = x;
    }

    public int getCode(){
        return code;
    }

    public String getReadingInString(){
        return "value: "+x;
    }

}