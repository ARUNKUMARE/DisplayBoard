package in.co.irctc.displayboard.entity;

import java.time.LocalTime;
import java.util.Set;

import lombok.Data;

@Data
public class TrainDetails {
	
	private Station sourceStation;
	private Station destinationStation;
	private Set<TrainTravelStation> trainTravelStations;
}
