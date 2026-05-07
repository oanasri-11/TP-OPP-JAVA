import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet ;

public class Alert implements Comparable<Alert>{
    
    static private SortedSet<Alert> alertsHistory = new TreeSet<>();
    
    static private int numAlerts = 0;

    private int code ;
    private Readings read ;
    private Date date;
    private SeverityLevel lvl ;
  
    public Alert(SeverityLevel lvl , Readings read){
        numAlerts ++;
        this.code = numAlerts;
        this.lvl = lvl;
        this.read = read;
        this.date = read.getDate();
    }

    public SeverityLevel getSeverityLevel(){
        return lvl;
    }

    static public void generateAlert(Readings read){
        alertsHistory.add(new Alert(SeverityLevel.warning , read));
    }

    public int compareTo(Alert a){

        switch(a.getSeverityLevel()){
            case warning :
                if(this.lvl == SeverityLevel.critical) return -1;
                break;
            
            case critical :
                if(this.lvl == SeverityLevel.warning) return 1;
                break;
        }

        return 0;

    }

    static  public  SortedSet<Alert> getAlertsHistory(){
        return alertsHistory;
    }

    public void display(){
        String level ;
        if(lvl == SeverityLevel.warning) level = "waring";
        else level = "critical";

        System.out.println("\nAlert #" + code + " :");
        System.out.println("\tSeverity Level : "+ level +" | Date : "+ date +" | ");
        System.out.println("\tReading reason : Reading #"+ read.getCode() +":");
        System.out.println("\t\texceeding value : " + read.getReadingInString());
    }

}