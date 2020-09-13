package in.co.irctc.displayboard.vo;

import java.time.LocalTime;
import java.util.Set;

import lombok.Data;

@Data
public class TrainTravelStationVo {
	
	private LocalTime time;
	private StationVo station;
}
