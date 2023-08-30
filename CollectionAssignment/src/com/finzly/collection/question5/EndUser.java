package com.finzly.collection.question5;

// import statements
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EndUser {

	public static void main(String[] args) {
		
		Map<String,Project> projects=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		boolean bval=true;
		
		while(bval) {
		
			System.out.println("1- Add Projects");
			System.out.println("2- Assign Team Members");
			System.out.println("3- View Project Details");
			System.out.println("4- List all Projects");
			System.out.println("5- Exit the program");
			
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			
			case 1: System.out.println("Adding Projects...");
			        System.out.println("Enter project name:");
			        String name=sc.nextLine();
			        System.out.println("Enter project domain ");
			        String domain=sc.nextLine();
			        projects.put(name,new Project(name,domain));
			        break;
			        
			case 2: System.out.println("Assigning Team Members");
			        System.out.println("Enter project name");
			        String projectName=sc.nextLine();
			        if(projects.containsKey(projectName)) {
			        	Project project=projects.get(projectName);
			        	System.out.println("Enter Team Member");
			        	String teamMember=sc.nextLine();
			        	project.teamMembers.add(teamMember);
			        }
			        else {
			        	System.out.println("Please check project name");
			        }
			        break;
			        
			case 3: System.out.println("View Project Details");
			        String pName=sc.nextLine();
			        if(projects.containsKey(pName)) {
			        	Project project=projects.get(pName);
			        	System.out.println("Project name: "+project.getProjectName());
			        	System.out.println("Project domain: "+project.getProjectDomain());
			        	System.out.println("Team members "+project.getTeamMembers());
			        }
			        else {
			        	System.out.println("Project not found");
			        }
			        break;
			        
			case 4: System.out.println("List all Projects");
			        for(Project project: projects.values()) {
				        System.out.println("Project name: "+project.getProjectName());
	        	        System.out.println("Project domain: "+project.getProjectDomain());
	        	        System.out.println("Team members "+project.getTeamMembers());
			        }
			        break;
			        
			case 5: System.out.println("Exiting the program...");
					bval=false;
					break;
		
	        default: System.out.println("Invalid choice");
			
			        
			}
			
		}
	 sc.close();
	}
}
