package com.claude.springjpatutorial.topic;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

//sole purpose lies with bridging objects with database management operations
public interface TopicRepository extends CrudRepository<Topic,String>{ //Generic parameterized types of Entity and Primary Key

//    ArrayList<Topic> getAllTopics();
//    Topic getTopic(String id);
//    Topic updateTopic(String id);
//    void deleteTopicById(String id);

}
