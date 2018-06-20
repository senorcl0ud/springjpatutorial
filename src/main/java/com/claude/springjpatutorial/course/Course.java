package com.claude.springjpatutorial.course;

import com.claude.springjpatutorial.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity //@Entity annotation defines that a class can be mapped to a table.
public class Course implements Serializable{

    @Id //sets primary key in table
    private String id;
    private String name;
    private String course_description;

    //passing in a topic as part of the course entity allows for an easier way to create a course with a given topic
    @ManyToOne
    private Topic topic;
//manytoone

    public Course(){
    }

    public Course(String id, String name, String description, String topicId){
        this.id = id;
        this.name = name;
        this.course_description = description;
        this.topic = new Topic(topicId,"","");
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

    public String getCourse_description() {
        return course_description;
    }

    public void setCourse_description(String course_description) {
        this.course_description = course_description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", course_description='" + course_description + '\'' +
                ", topic=" + topic +
                '}';
    }
}
