package org.csf.resortmanager.repository.entity;

import javax.persistence.*;

/**
 * Created by agpopikov on 25/02/15.
 */
@Entity
@Table(name = "services")
public class ServiceEntity {

    private Long id;
    private String name;
    private String description;
    private String phone;

    public ServiceEntity() {
        //
    }

    public ServiceEntity(String name, String description, String phone) {
        this.name = name;
        this.description = description;
        this.phone = phone;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "service_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "service_description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "service_phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
