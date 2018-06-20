package com.claude.springjpatutorial.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "spring framework", "spring framework desrcription"),
            new Topic("java","core java","java description"),
            new Topic("javascript","node","javascript description")
    ));


    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){
        return topicRepository.findById(id).orElse(null);
    }

    public Topic createTopic(Topic topic){
        return topicRepository.save(topic);
    }

    public Topic updateTopic(Topic topic, String id) {
        return topicRepository.save(topic);
        //as long as the Topic instance has the id set then the id doesn't need to be passed in.
    }

    public void deleteTopicByID(String topicId){
        topicRepository.deleteById(topicId);
    }
}
