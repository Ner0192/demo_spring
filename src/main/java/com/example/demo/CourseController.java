package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<CourseConfiguration> retrieveAllCourses() {
		// var cl = SpringApplication.run(DemoApplication.class);
		// Course c = cl.getBean(Course.class);
		// System.out.println(c.toString());
		return Arrays.asList(

				new CourseConfiguration(1, "Learn AWS", "in28minutes"),
				new CourseConfiguration(2, "Learn GCP", "in28minutes"),
				new CourseConfiguration(300, "Learn AZURE", "in28minutes"));
	}

	@RequestMapping("/course")
	public List<CourseConfiguration> retrieveoneCourses() {
		// var cl = SpringApplication.run(DemoApplication.class);
		// Course c = cl.getBean(Course.class);
		// System.out.println(c.toString());
		return Arrays.asList(

				new CourseConfiguration(1, "Learn AWS", "in28minutes"));
	}

}
