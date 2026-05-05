import java.util.Date;

public class Alert{
    
    private Readings read ;
    private Date date;
    private SeverityLevel lvl ;
  
    public Alert(SeverityLevel lvl , Readings read){
        this.lvl = lvl;
        this.read = read;
        this.date = read.getDate();
    }

}