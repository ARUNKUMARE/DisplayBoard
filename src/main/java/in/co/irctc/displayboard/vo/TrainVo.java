package in.co.irctc.displayboard.vo;

import java.time.LocalTime;
import java.util.Set;

import lombok.Data;

@Data
public class TrainVo {
	private String trainCode;
	private String trainName;
	private TrainDetailsVo trainDetails;
	private StationVo previousStation;
	private StationVo currentStation;
	private StationVo nextStation;
	private boolean isSeatAvailable;
	private boolean isTrainAvailable;
}
