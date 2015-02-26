package org.csf.resortmanager.repository.entity;

import javax.persistence.*;

/**
 * Created by agpopikov on 25/02/15.
 */
@Entity
@Table(name = "staff")
public class StaffEntity {

    private Long id;
    private String firstName;
    private String lastName;
    private String secondName;
    private String phone;
    private StaffPositionEntity position;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "staff_first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "staff_last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "staff_second_name")
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Column(name = "staff_phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @ManyToOne
    @JoinColumn(name = "staff_position")
    public StaffPositionEntity getPosition() {
        return position;
    }

    public void setPosition(StaffPositionEntity position) {
        this.position = position;
    }
}
