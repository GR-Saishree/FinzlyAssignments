package com.finzly.collection.question5;

// import statements
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Project {

	Scanner sc=new Scanner(System.in);
	
	
	// Project class variables
	private String projectName;
	private String projectDomain;
	Set<String> teamMembers;
	
	public Project(String projectName, String projectDomain) {
		super();
		setProjectName(projectName);
		setProjectDomain(projectDomain);
		this.teamMembers = new HashSet<>();
	}
	
	
	// Getters and Setters for project name
	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		if(!projectName.isEmpty()) {
			this.projectName = projectName;
		}
		else {
			System.out.println("Enter a valid project name");
			setProjectName(sc.nextLine());
		}
		
	}
	
	// Getters and Setters for team members
	public Set<String> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(Set<String> teamMembers) {
		this.teamMembers = teamMembers;
	}
	
	
	// Getters and Setters for project domain
	public String getProjectDomain() {
		return projectDomain;
	}
	public void setProjectDomain(String projectDomain) {
		if(!projectDomain.isEmpty()) {
			this.projectDomain = projectDomain;
		}
		else {
			System.out.println("Enter a valid project domain");
			setProjectName(sc.nextLine());
		}
	}
	
	
	
	
}
