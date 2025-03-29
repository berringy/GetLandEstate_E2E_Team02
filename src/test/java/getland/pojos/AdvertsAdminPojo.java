package getland.pojos;

public class AdvertsAdminPojo {

/*
{
  "id": 3,
  "title": "Modern Office",
  "description": "Modern amenities for your comfort.",
  "price": 300000,
  "statusForAdvert": "ACTIVATED",
  "builtIn": true,
  "viewCount": 6,
  "location": {
    "lat": 37.8537655,
    "lng": 27.7235028
  }
 */

    private int id;
    private String title;
    private String description;
    private int price;
    private String statusForAdvert;
    private boolean builtIn;
    private int viewCount;
    private LocationPojo location;

    public AdvertsAdminPojo() {
    }

    public AdvertsAdminPojo(int id, String title, String description, int price, String statusForAdvert, boolean builtIn, int viewCount, LocationPojo location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.statusForAdvert = statusForAdvert;
        this.builtIn = builtIn;
        this.viewCount = viewCount;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatusForAdvert() {
        return statusForAdvert;
    }

    public void setStatusForAdvert(String statusForAdvert) {
        this.statusForAdvert = statusForAdvert;
    }

    public boolean isBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(boolean builtIn) {
        this.builtIn = builtIn;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public LocationPojo getLocation() {
        return location;
    }

    public void setLocation(LocationPojo location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "AdvertsAdminPojo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", statusForAdvert='" + statusForAdvert + '\'' +
                ", builtIn=" + builtIn +
                ", viewCount=" + viewCount +
                ", location=" + location +
                '}';
    }


}

