package com.javaprojects.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaprojects.springboot.entity.Project;
import com.javaprojects.springboot.repositories.ProjectRepository;

@SpringBootApplication
public class JavaProjectManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(JavaProjectManagementSystemApplication.class, args);
	}

	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Project project1 = new Project("Java Project", "John", "Johnson", "john@github.com");
//		projectRepository.save(project1);
//		
//		Project project2 = new Project("Python Project", "Will", "Williams", "will@github.com");
//		projectRepository.save(project2);
//		
//		Project project3 = new Project("React Project", "Frank", "Frankfort", "frank@github.com");
//		projectRepository.save(project3);

	}

}
