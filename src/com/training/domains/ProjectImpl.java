package com.training.domains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.training.ifaces.IProject;


public class ProjectImpl implements IProject {
	private List<Project> ProjectList;


	public ProjectImpl(List<Project> ProjectList) {
		super();
		this.ProjectList = ProjectList;
	}
	
	public ProjectImpl(){
		super();
		ProjectList = new ArrayList<>();
	}

	@Override
	public boolean addProject(Project obj) {
		// TODO Auto-generated method stub
		boolean result = false;
		result = ProjectList.add(obj);
		return result;
	}

	@Override
	public boolean[] addProjects(Project... dnrList) {
		// TODO Auto-generated method stub
		int size = dnrList.length;
		boolean result[] = new boolean[size];
		int i = 0;
		
		for(Project Project : dnrList)
		{
			result[i] = ProjectList.add(Project);
			i++;
		}
		return result;
	}

	@Override
	public void printProjectList() {
		// TODO Auto-generated method stub
        for(Project Project : ProjectList)
        {	
		  System.out.println(Project);
        }
	}

	@Override
	public List<Project> getProjectList() {
		// TODO Auto-generated method stub
		return ProjectList;
		
	
	}
	

}
