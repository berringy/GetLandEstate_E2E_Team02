package getland.pojos;

import java.io.Serializable;

public class TourDatePojo implements Serializable {
	private String tourDate;
	private TourTimePojo tourTime;
	private int advertId;

	public TourDatePojo() {
	}

	public TourDatePojo(String tourDate, TourTimePojo tourTime, int advertId) {
		this.tourDate = tourDate;
		this.tourTime = tourTime;
		this.advertId = advertId;
	}

	public void setTourDate(String tourDate){
		this.tourDate = tourDate;
	}

	public String getTourDate(){
		return tourDate;
	}

	public void setTourTime(TourTimePojo tourTime){
		this.tourTime = tourTime;
	}

	public TourTimePojo getTourTime(){
		return tourTime;
	}

	public void setAdvertId(int advertId){
		this.advertId = advertId;
	}

	public int getAdvertId(){
		return advertId;
	}

	@Override
 	public String toString(){
		return 
			"US01APIPojo{" + 
			"tourDate = '" + tourDate + '\'' + 
			",tourTime = '" + tourTime + '\'' + 
			",advertId = '" + advertId + '\'' + 
			"}";
		}
}