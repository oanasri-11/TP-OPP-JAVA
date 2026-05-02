
import java.util.ArrayList;
import java.util.List;

public class Cropszone extends Geographicalzone{
    
    private List<Crop> crop_fields ;
    

    public Cropszone(String name, String code) {
        super(name, code);
        crop_fields = new ArrayList<>();
    }

}