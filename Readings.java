
import java.util.Date;

public class Readings{

    static private int numReading = 0;
    
    private int code ;
    protected  double x = 0;
    protected Date date;
    protected Geographicalzone zone;
    protected Sensor sensor;

    public Readings(){
        numReading ++;
        code = numReading;
        date = new Date();
    }

    public Readings(double x , Thershold range , Geographicalzone zone , Sensor sensor) {
        numReading ++;
        code = numReading;
        date = new Date();
        this.sensor = sensor ;
        this.zone = zone;
        this.x = x;
        if(!range.isinRange(x)){
            Alert.generateAlert(this);
        }
    }

    public Geographicalzone getZone(){
        return zone;
    }

    public Sensor getSensor(){
        return sensor;
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