package getland.pojos;

public class LocationPojo {


    private int lat;
    private int lng;


    public LocationPojo() {
    }

    public LocationPojo(int lat, int lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLng() {
        return lng;
    }

    public void setLng(int lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "LocationPojo{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }


}
