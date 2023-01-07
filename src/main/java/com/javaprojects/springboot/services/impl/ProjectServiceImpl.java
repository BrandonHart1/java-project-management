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


	@Override
	public Project saveProject(Project project) {
		
		return projectRepository.save(project);
	}


	@Override
	public Project getProjectById(Long id) {
		return projectRepository.findById(id).get();
	}


	@Override
	public Project updateProject(Project project) {
		return projectRepository.save(project);
	}


	@Override
	public void deleteProjectById(Long id) 
	{
		projectRepository.deleteById(id);
	}

}
