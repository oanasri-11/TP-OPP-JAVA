
import java.util.ArrayList;
import java.util.List;

public class ManageAlertSystem {



    static public void displayActiveAlerts(){
        for(Alert a : Alert.getAlertsHistory()){
            a.display();
            System.out.println();
        }
    }

    static public void dismissAlert(Alert a , boolean dismiss){
        if(dismiss) Alert.getAlertsHistory().remove(a);
    }

    static public  List<Alert> browseAlertHistory(Geographicalzone zone){
        List result = new ArrayList<>();

        for(Alert alert : Alert.getAlertsHistory() ){
            if(alert.getReading().getZone().equals(zone)) {
                result.add(alert);
            }
        }

        return result;
    }

    static public List<Alert> browseAlertHistory(SensorType type){
        List result = new ArrayList<>();

        for(Alert alert : Alert.getAlertsHistory() ){
            if(alert.getReading().getSensor().getStatus().equals(type)) {
                result.add(alert);
            }
        }

        return result;
    }

    static public List<Alert> browseAlertHistory(SeverityLevel lvl){
        List result = new ArrayList<>();

        for(Alert alert : Alert.getAlertsHistory() ){
            if(alert.getSeverityLevel().equals(lvl)) {
                result.add(alert);
            }
        }

        return result;
    }


    // time period ????

}