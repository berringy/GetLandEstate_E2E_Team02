package getland.pojos.user_controller;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)

public class US05_UserGetResponsePojo implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String role;
    private String profilePhoto;


    public US05_UserGetResponsePojo() {
    }

    public US05_UserGetResponsePojo(int id, String firstName, String lastName, String email, String phone, String role, String profilePhoto) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.profilePhoto = profilePhoto;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getprofilePhoto() {
        return profilePhoto;
    }

    public void setprofilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }


    @Override
    public String toString() {
        return
                "UserResponsePojo{" +
                        "id = '" + id + '\'' +
                        ",firstName = '" + firstName + '\'' +
                        ",lastName = '" + lastName + '\'' +
                        ",email = '" + email + '\'' +
                        ",phone = '" + phone + '\'' +
                        ",role = '" + role + '\'' +
                        ",profilePhoto = '" + profilePhoto + '\'' +
                        "}";
    }
}