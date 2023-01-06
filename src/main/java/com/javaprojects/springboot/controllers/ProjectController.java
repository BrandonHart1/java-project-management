package com.javaprojects.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	
	// -------- Handle project requests and return model/view
	@GetMapping("projects")
	public String listProjects(Model model)
	{
		model.addAttribute("projects", projectService.getAllProjects());
		return "projects";
	}
	
}
