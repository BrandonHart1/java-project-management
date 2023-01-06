package com.javaprojects.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javaprojects.springboot.entity.Project;
import com.javaprojects.springboot.services.ProjectService;

@Controller
public class ProjectController 
{
	// -------- Dependency Injection --------
	private ProjectService projectService;

	// -------- Constructor --------
	public ProjectController(ProjectService projectService) {
		super();
		this.projectService = projectService;
	}
	
	// -------- Return model/view --------
	@GetMapping("projects")
	public String listProjects(Model model)
	{
		model.addAttribute("projects", projectService.getAllProjects());
		return "projects";
	}
	
	// -------- Create New Project --------
	@GetMapping("/projects/new")
	public String createProjectForm(Model model) 
	{
		Project project = new Project();
		model.addAttribute("project", project);
		return "create_project";
	}
	
	// -------- Form Handler --------
	
	
}
