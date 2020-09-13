package in.co.irctc.displayboard.entity;

import java.time.LocalTime;
import java.util.Set;

import lombok.Data;

@Data
public class TrainTravelStation {
	
	private LocalTime time;
	private Station station;
}
