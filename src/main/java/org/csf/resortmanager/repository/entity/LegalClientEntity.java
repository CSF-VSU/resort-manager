package org.csf.resortmanager.repository.entity;

/**
 * Created by agpopikov on 25/02/15.
 */
public class LegalClientEntity extends ClientEntity {

    private String title;
    private String address;

    public LegalClientEntity() {
        //
    }

    public LegalClientEntity(String firstName, String lastName, String secondName, String phone, String email, String title, String address) {
        super(firstName, lastName, secondName, phone, email);
        this.title = title;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
