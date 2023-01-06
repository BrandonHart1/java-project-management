package com.javaprojects.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprojects.springboot.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

}
