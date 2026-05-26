import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet ;

public class Alert implements Comparable<Alert>{
    
    static private SortedSet<Alert> alertsHistory = new TreeSet<>();
    static private SortedSet<Alert> ActivedAlerts = new TreeSet<>();
    
    static private int numAlerts = 0;

    private int code ;
    private Readings read ;
    private Date date;
    private SeverityLevel lvl ;
    private boolean dismissed = false;
  
    public Alert(SeverityLevel lvl , Readings read){
        numAlerts ++;
        this.code = numAlerts;
        this.lvl = lvl;
        this.read = read;
        this.date = read.getDate();
        System.out.println("alert is active");
    }

    public SeverityLevel getSeverityLevel(){
        return lvl;
    }

    static public void generateAlert(Readings read){
        Alert alert = new Alert(SeverityLevel.warning , read);
        alertsHistory.add(alert);
        ActivedAlerts.add(alert);
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

    static  public  SortedSet<Alert> getActivedAlerts(){
        return ActivedAlerts;
    }


    public Readings getReading(){
        return read;
    }

    public Date getDate(){
        return date;
    }

    public void display(){

        System.out.println("Alert #" + code + " :");
        System.out.println("\tSeverity Level : "+ lvl.toString() +" | Date : "+ date +" | ");
        System.out.println("\tReading reason : Reading #"+ read.getCode() +":");
        System.out.println("\t\texceeding value : " + read.getReadingInString());
    }

    public void acknowledge(){
        ActivedAlerts.remove(this) ;
    }

    public void dismiss(){
        ActivedAlerts.remove(this) ;
        dismissed = true;
    }


}