import java.util.ArrayList;
import java.util.List;

public class ManageZones {

	private final List<Geographicalzone> zones;

	public ManageZones() {
		zones = new ArrayList<>();
	}

	public Geographicalzone addZone(String type, String name, double longitude, double latitude) {
		Geographicalzone zone;

		if (type == null) {
			throw new IllegalArgumentException("Zone type cannot be null");
		}

		switch (type.trim().toLowerCase()) {
			case "crop":
			case "crops":
			case "cropszone":
				zone = new Cropszone(name, longitude, latitude);
				break;
			case "poultry":
				zone = new Poultry(name, longitude, latitude);
				break;
			case "ruminates":
			case "livestock":
				zone = new Ruminates(name, longitude, latitude);
				break;
			case "aquaculture":
				zone = new Aquaculturezone(name, longitude, latitude);
				break;
			default:
				throw new IllegalArgumentException("Unknown zone type: " + type);
		}

		zones.add(zone);
		return zone;
	}

	public List<Geographicalzone> getZones() {
		return zones;
	}

	public void displayZones() {
		for (Geographicalzone zone : zones) {
			System.out.println("Zone #" + zone.getCode()
					+ " | " + zone.getName()
					+ " | status: " + zone.getStatus()
					+ " | longitude: " + zone.getLongitude()
					+ " | latitude: " + zone.getLatitude());
		}
	}
}
