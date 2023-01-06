package com.javaprojects.springboot.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaprojects.springboot.entity.Project;
import com.javaprojects.springboot.repositories.ProjectRepository;
import com.javaprojects.springboot.services.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService
{
	
	private ProjectRepository projectRepository;
	

	public ProjectServiceImpl(ProjectRepository projectRepository) {
		super();
		this.projectRepository = projectRepository;
	}


	@Override
	public List<Project> getAllProjects() {
		
		return projectRepository.findAll();
	}

}
