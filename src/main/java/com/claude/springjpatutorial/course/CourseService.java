package com.claude.springjpatutorial.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id){
        return courseRepository.findById(id).orElse(null);
    }

    public Course createCourse(Course course){
        return courseRepository.save(course);
    }

    public Course updateCourse(Course course) {
        return courseRepository.save(course);
        //as long as the Topic instance has the id set then the id doesn't need to be passed in.
    }

    public void deleteCourseByID(String courseId){
        courseRepository.deleteById(courseId);
    }
}
