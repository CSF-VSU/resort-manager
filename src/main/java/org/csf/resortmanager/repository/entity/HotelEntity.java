package org.csf.resortmanager.repository.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by agpopikov on 25/02/15.
 */
@Entity
@Table(name = "hotels")
public class HotelEntity {

    private Long id;
    private String name;
    private String address;
    private String phone;
    private Set<RoomEntity> rooms;
    private Set<ServiceEntity> services;
    private Set<StaffEntity> staff;

    public HotelEntity() {
        //
    }

    public HotelEntity(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "hotel_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "hotel_address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "hotel_phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<RoomEntity> getRooms() {
        return rooms;
    }

    public void setRooms(Set<RoomEntity> rooms) {
        this.rooms = rooms;
    }

    public Set<ServiceEntity> getServices() {
        return services;
    }

    public void setServices(Set<ServiceEntity> services) {
        this.services = services;
    }

    public Set<StaffEntity> getStaff() {
        return staff;
    }

    public void setStaff(Set<StaffEntity> staff) {
        this.staff = staff;
    }
}
