package in.co.irctc.displayboard.configuration;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationConfiguraiton {
	
	public TrainVo getAvailableTrains(@RequestParam String stationCode) {
		
	}

}
