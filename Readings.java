
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Readings{

    static private List<Alert> alertsHistory = new ArrayList<>();
    
    protected  double x = 0;
    protected Date date;

    public Readings(double x , Thershold range) {
        date = new Date();
        this.x = x;
        if(!range.isinRange(x)){
            generateAlert();
        }
    }

    public Date getDate(){
        return date;
    }

    public double getValue(){
        return x;
    }

    public void generateAlert(){
        alertsHistory.add(new Alert(SeverityLevel.warning , this));
    }

}