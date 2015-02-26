package org.csf.resortmanager.repository.entity;

import javax.persistence.*;

/**
 * Created by agpopikov on 25/02/15.
 */
@Entity
@Table(name = "staff_positions")
public class StaffPositionEntity {

    private Long id;
    private String name;

    public StaffPositionEntity() {
        //
    }

    public StaffPositionEntity(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_position_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "staff_position_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
