package in.co.irctc.displayboard.entity;

import java.time.LocalTime;
import java.util.Set;

import lombok.Data;

@Data
public class Train {
	private String trainCode;
	private String trainName;
	private TrainDetails trainDetails;
	private Station previousStation;
	private Station currentStation;
	private Station nextStation;
	private boolean isSeatAvailable;
	private boolean isTrainAvailable;
}
