package com.claude.springjpatutorial.topic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    //TODO create a controller and map a particular REQUEST to a method.

    @Autowired
    private TopicService topicService;


    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }


    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public Topic createTopic(@RequestBody Topic topic){
        return topicService.createTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
    public Topic updateTopic(@RequestBody Topic topic, @PathVariable String id){
        return topicService.updateTopic(topic, id);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopicByID(id);
    }

    /**
     * JSON has key names corresponding to property names of the Topic class The JSON values are those properties.
     *
     * If you make a request at the wrong endpoint you'll likely receive a 500 error.
     *
     *If you try to create an object with different property values or different property names that information won't get stored and the object you create will just have null values for the mapped properties you declared.
     *
     */
}
