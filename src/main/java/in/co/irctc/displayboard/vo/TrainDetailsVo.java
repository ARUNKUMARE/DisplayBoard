package in.co.irctc.displayboard.vo;

import java.time.LocalTime;
import java.util.Set;

import lombok.Data;

@Data
public class TrainDetailsVo {
	
	private StationVo sourceStation;
	private StationVo destinationStation;
	private Set<TrainTravelStationVo> trainTravelStations;
}
