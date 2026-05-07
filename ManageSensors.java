
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManageSensors{

     


    static public void addSensor(SensorType type , Geographicalzone zone , double min , double max){
        try{
            zone.addSensor(type, min, max);
        }
        catch(WrongTypeSensorException e){
            System.out.println("The type of this Sensor is not special for given zone");
        }
    }

    static public void displayDashboardOfZone(Geographicalzone zone){
        zone.displayReadings();
    }

    static public void displayDashboardOfSensor(Sensor s){
        s.displayReading();
    }


    static public List<Readings> browseReadingsByDateRange( Sensor s , Date from , Date to){
        List<Readings> results = new ArrayList<>() ;
        for(Readings read : s.getReadingsHistory()){
            Date date = read.getDate() ;
            if( date.compareTo(from) >= 0 && date.compareTo(to) <= 0  ) results.add(read);
        }

        return results ;
    }

    static public void changeStatusOfSensor(Sensor s , SensorStatus status){
        s.setStatus(status);
    }

    static public void displayGraphicalCharts(){

    }

}