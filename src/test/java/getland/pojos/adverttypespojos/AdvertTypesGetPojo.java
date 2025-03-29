package getland.pojos.adverttypespojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvertTypesGetPojo {

    private int id;
    private String title;
    private boolean builtIn;

    public AdvertTypesGetPojo() {
    }

    public AdvertTypesGetPojo(int id, String title, boolean builtIn) {
        this.id = id;
        this.title = title;
        this.builtIn = builtIn;
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

    public boolean getisBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(boolean builtIn) {
        this.builtIn = builtIn;
    }

    @Override
    public String toString() {
        return "AdvertTypesGetPojo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", builtIn=" + builtIn +
                '}';
    }
}
