package org.csf.resortmanager.repository.entity;

import javax.persistence.*;

/**
 * Created by agpopikov on 25/02/15.
 */
@Entity
@Table(name = "room_classes")
public class RoomClassEntity {

    private Integer id;
    private String title;
    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_class_id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "room_class_title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "room_class_description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
