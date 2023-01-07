package com.javaprojects.springboot.services;

import java.util.List;

import com.javaprojects.springboot.entity.Project;

public interface ProjectService 
{
	List<Project>getAllProjects(); 
	
	Project saveProject(Project project);
	
	Project getProjectById(Long id);
	
	Project updateProject(Project project);
	
	void deleteProjectById(Long id);	
}
