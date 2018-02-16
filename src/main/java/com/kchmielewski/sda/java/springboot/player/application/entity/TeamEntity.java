package com.kchmielewski.sda.java.springboot.player.application.entity;

import javax.persistence.*;

@Entity
@Table(name = "team", catalog = "postgresql")
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public TeamEntity() {
    }

    public TeamEntity(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
