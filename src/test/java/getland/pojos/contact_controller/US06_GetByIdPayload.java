package getland.pojos.contact_controller;

public class US06_GetByIdPayload {

    /*
  "id": 0,
  "firstName": "string",
  "lastName": "string",
  "email": "string",
  "message": "string",
     */
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String message;
    private boolean status;
    private String createdAt;

    public US06_GetByIdPayload(){}

    public US06_GetByIdPayload(Integer contactMessageId, String mail, String fname, String lname, String mes, boolean b,String cA) {
    }

    public  Integer getId(){
        return id;
    }
    public String getEmail() {
        return email;
    }

    public boolean isStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getCreatedAt() {
        return createdAt;
    }
}
