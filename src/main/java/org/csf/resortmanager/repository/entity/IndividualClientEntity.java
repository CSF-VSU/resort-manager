package org.csf.resortmanager.repository.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by agpopikov on 25/02/15.
 */
@Entity
@Table(name = "individual_client")
public class IndividualClientEntity extends ClientEntity {

    private String passport;

    public IndividualClientEntity() {
        //
    }

    public IndividualClientEntity(String firstName, String lastName, String secondName, String phone, String email, String passport) {
        super(firstName, lastName, secondName, phone, email);
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
