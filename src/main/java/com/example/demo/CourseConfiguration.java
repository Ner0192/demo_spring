package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CourseConfiguration {
	private long id;
	private String name;
	private String author;

	public CourseConfiguration() {
		this.id = 18;
		this.name = "Aug";
		this.author = "2020";
	}

	public CourseConfiguration(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}
