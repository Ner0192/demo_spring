package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		// var cl = SpringApplication.run(DemoApplication.class);
		// Course c = cl.getBean(Course.class);
		// System.out.println(c.toString());
		return Arrays.asList(

				new Course(1, "Learn AWS", "in28minutes"),
				new Course(2, "Learn GCP", "in28minutes"),
				new Course(300, "Learn AZURE", "in28minutes"));
	}

	@RequestMapping("/course")
	public List<Course> retrieveoneCourses() {
		// var cl = SpringApplication.run(DemoApplication.class);
		// Course c = cl.getBean(Course.class);
		// System.out.println(c.toString());
		return Arrays.asList(

				new Course(1, "Learn AWS", "in28minutes"));
	}

}
