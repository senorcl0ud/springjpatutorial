package com.claude.springjpatutorial.topic;

import javax.persistence.*;
import java.io.Serializable;

@Entity //jpa creates a table names Topic with x amount of columns based on instance vars
public class Topic implements Serializable {

    //denotes primary key
    @Id
    private String id;
    private String name;
    private String description;

    public Topic(){}


    public Topic(String id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
