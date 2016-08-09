package com.training.ifaces;

import java.util.List;

import com.training.domains.*;;

/**
 * 
 * @author mrai7
 *
 */
public interface IProject {
	public boolean addProject(Project obj);
	public boolean[] addProjects(Project... dnrList);
	public void printProjectList();
	public List<Project> getProjectList();

}
