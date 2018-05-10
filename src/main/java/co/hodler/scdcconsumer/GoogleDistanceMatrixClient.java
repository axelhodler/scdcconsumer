package co.hodler.scdcconsumer;

import com.jayway.jsonpath.JsonPath;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "google-distance-service")
public interface GoogleDistanceMatrixClient {

	@GetMapping("/maps/api/distancematrix/json")
	String getDistance(@RequestParam("origins") String origin,
					   @RequestParam("destinations") String destination);

	default Integer getDrivingDurationBetween(String origin, String destination) {
		return JsonPath.parse(this.getDistance(origin, destination))
			.read("$.rows[0].elements[0].duration.value", Integer.class);
	}

}