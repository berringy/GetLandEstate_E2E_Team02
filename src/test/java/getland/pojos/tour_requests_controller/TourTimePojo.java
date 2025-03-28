package getland.pojos.tour_requests_controller;

import java.io.Serializable;

public class TourTimePojo implements Serializable {
	private int hour;
	private int minute;
	private int second;
	private int nano;

	public TourTimePojo() {
	}

	public TourTimePojo(int hour, int minute, int second, int nano) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.nano = nano;
	}

	public void setHour(int hour){
		this.hour = hour;
	}

	public int getHour(){
		return hour;
	}

	public void setMinute(int minute){
		this.minute = minute;
	}

	public int getMinute(){
		return minute;
	}

	public void setSecond(int second){
		this.second = second;
	}

	public int getSecond(){
		return second;
	}

	public void setNano(int nano){
		this.nano = nano;
	}

	public int getNano(){
		return nano;
	}

	@Override
 	public String toString(){
		return 
			"TourTimePojo{" + 
			"hour = '" + hour + '\'' + 
			",minute = '" + minute + '\'' + 
			",second = '" + second + '\'' + 
			",nano = '" + nano + '\'' + 
			"}";
		}
}