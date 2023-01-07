package com.javaprojects.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	@PostMapping("/projects")
	public String saveProject(@ModelAttribute("project") Project project)
	{
		projectService.saveProject(project);
		return "redirect:/projects";
	}
	
	// -------- Handle Update Request --------
	@GetMapping("/projects/edit/{id}")
	public String editProjectForm(@PathVariable Long id, Model model)
	{
		model.addAttribute("project", projectService.getProjectById(id));
		return "edit_project";
	}
	
	@PostMapping("/projects/{id}")
	public String updateProject(@PathVariable Long id, @ModelAttribute("project") Project project, Model model)
	{
		// -------- Get project from the database by the id --------
		Project existingProject = projectService.getProjectById(id);
		existingProject.setId(id);
		existingProject.setProjectName(project.getProjectName());
		existingProject.setFirstName(project.getFirstName());
		existingProject.setLastName(project.getLastName());
		existingProject.setEmail(project.getEmail());
		
		// -------- Save updated project --------
		projectService.updateProject(existingProject);
		return "redirect:/projects";
	}
	
	// -------- Delete Project Request --------
	@GetMapping("/projects/{id}")
	public String deleteProject(@PathVariable Long id)
	{
		projectService.deleteProjectById(id);
		return "redirect:/projects";
	}
}
