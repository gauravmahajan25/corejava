package multithreading;

import java.util.HashMap;
import java.util.Map;

public class TestVehicleTracker {
	
	public static void main(String[] args) {
		SafePoint location = new SafePoint(1, 2);
		
		Map<String, SafePoint> trackerMap = new HashMap<>();
		trackerMap.put("One", location);
		
		
		PublishingVehicleTracker vehicleTracker = new PublishingVehicleTracker(trackerMap);
		Map<String, SafePoint> result  =  vehicleTracker.getLocations();
		
		location.set(3, 4);
		//result.put("One", new SafePoint(location));
		
		SafePoint resLoc  =  vehicleTracker.getLocation("One");
		
		resLoc.set(3, 4);
		System.out.println(resLoc.get()[0]+ " " +resLoc.get()[1]);
	}

}
