
import java.util.ArrayList;
import java.util.List;

public class Farm {
  private List<Geographicalzone> zones;
  public Farm() {
        this.zones = new ArrayList<>();
    }
    public void addZone(Geographicalzone zone) {
        zones.add(zone);
    }
}