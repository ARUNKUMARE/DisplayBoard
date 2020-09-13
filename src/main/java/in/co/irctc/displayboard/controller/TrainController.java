package in.co.irctc.displayboard.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainController {
	
	public TrainVo getAvailableTrains(@RequestParam String stationCode) {
		
	}

}
