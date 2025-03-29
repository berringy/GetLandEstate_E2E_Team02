package getland.pojos;

public class AdvertControllerPojo {

    private String title;
    private String desc;
    private int price;
    private int advertTypeId;
    private int countryId;
    private int cityId;
    private int districtId;
    private LocationPojo location;
    private  String address;
    private boolean active;
    private String propertyValues;

    public AdvertControllerPojo() {
    }

    public AdvertControllerPojo(String title, String desc, int price, int advertTypeId, int countryId, int cityId, int districtId, LocationPojo location, String address, boolean active, String propertyValues) {
        this.title = title;
        this.desc = desc;
        this.price = price;
        this.advertTypeId = advertTypeId;
        this.countryId = countryId;
        this.cityId = cityId;
        this.districtId = districtId;
        this.location = location;
        this.address = address;
        this.active = active;
        this.propertyValues = propertyValues;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAdvertTypeId() {
        return advertTypeId;
    }

    public void setAdvertTypeId(int advertTypeId) {
        this.advertTypeId = advertTypeId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public LocationPojo getLocation() {
        return location;
    }

    public void setLocation(LocationPojo location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(String propertyValues) {
        this.propertyValues = propertyValues;
    }

    @Override
    public String toString() {
        return "AdvertControllerPojo{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", advertTypeId=" + advertTypeId +
                ", countryId=" + countryId +
                ", cityId=" + cityId +
                ", districtId=" + districtId +
                ", location=" + location +
                ", address='" + address + '\'' +
                ", active=" + active +
                ", propertyValues='" + propertyValues + '\'' +
                '}';
    }
}

