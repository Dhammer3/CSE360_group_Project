package GUIProject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GUIProject 
{
	public static void main(String[] args)
	{
		String name, description, status;
		int dueDate, priority, amount;
		Status projectStatus = new Status("", 0);
		boolean initializedStatus = false;
		char input;
		Sorter Project;
		ArrayList<Sorter> projects = new ArrayList<Sorter>();
		Scanner in = new Scanner(System.in);

		System.out.print("Enter number of projects: ");
		amount = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i < amount; i++)
		{
			System.out.print("Enter Project Name: ");
			name = in.nextLine();
			System.out.print("Enter Project Due Date: ");
			dueDate = in.nextInt();
			in.nextLine();
			System.out.print("Enter Project Description: ");
			description = in.nextLine();
			System.out.print("Enter Project Priority: ");
			priority = in.nextInt();
			in.nextLine();
			
			do
			{
				System.out.print("Enter Project Status: ");
				status = in.nextLine();
				
				switch(status)
				{
					case "Not Started":
						projectStatus = new Status("Not Started", 1);
						initializedStatus = true;
						break;
						
					case "In Progress":
						projectStatus = new Status("In Progress", 2);
						initializedStatus = true;
						break;
						
					case "Completed":
						projectStatus = new Status("Completed", 3);
						initializedStatus = true;
						break;
						
					default:
						System.out.println("Invalid Status");
						break;
				}
			} while(initializedStatus == false);
			
			System.out.println();
			
			Project = new Sorter(name, description, priority, dueDate, projectStatus);
			projects.add(Project);
		}
		
		printMenu();
		//Sorter project;
		
		do
		{
			System.out.print("Enter a command: ");
			input = in.next().charAt(0);
			
			switch(input)
			{
				case 'A':
					for(int i = 0; i < amount - 1; i++)
					{
						int min = i;
						for(int j = i + 1; j < amount; j++)
						{
							int jASCII = projects.get(j).getName().charAt(0);
							int minASCII = projects.get(min).getName().charAt(0);
							
							if(jASCII < minASCII)
							{
								min = j;
							}
						}
						
						Collections.swap(projects, min, i);		
					}
					break;
					
				case 'B':
					for(int i = 0; i < amount - 1; i++)
					{
						int min = i;
						for(int j = i + 1; j < amount; j++)
						{
							if(projects.get(j).getDueDate() < projects.get(min).getDueDate())
							{
								min = j;
							}
						}
						
						Collections.swap(projects, min, i);		
					}
					break;
					
				case 'C':
					for(int i = 0; i < amount - 1; i++)
					{
						int min = i;
						for(int j = i + 1; j < amount; j++)
						{
							int jASCII = projects.get(j).getDescription().charAt(0);
							int minASCII = projects.get(min).getDescription().charAt(0);
							
							if(jASCII < minASCII)
							{
								min = j;
							}
						}
						
						Collections.swap(projects, min, i);		
					}
					break;
					
				case 'D':					
					for(int i = 0; i < amount - 1; i++)
					{
						int min = i;
						for(int j = i + 1; j < amount; j++)
						{
							if(projects.get(j).getPriority() < projects.get(min).getPriority())
							{
								min = j;
							}
						}
						
						Collections.swap(projects, min, i);		
					}
					break;
					
				case 'E':
					for(int i = 0; i < amount - 1; i++)
					{
						int min = i;
						for(int j = i + 1; j < amount; j++)
						{
							if(projects.get(j).getProjectStatus().getOrder() < projects.get(min).getProjectStatus().getOrder())
							{
								min = j;
							}
						}
						
						Collections.swap(projects, min, i);		
					}
					break;
					
				case 'F':
					for(int i = 0; i < amount; i++)
					{
						Sorter project = projects.get(i);
						System.out.println("\nProject Name: " + project.getName());
						System.out.println("Project Due Date: " + project.getDueDate());
						System.out.println("Project Description: " + project.getDescription());
						System.out.println("Project Priority: " + project.getPriority());
						System.out.println("Project Status: " + project.getProjectStatus().getStatus() + "\n");
					}
					break;
					
				case 'Q':
					break;
					
				default:
					System.out.print("Invalid Input\n");
					break;
			}
		} while(input != 'Q');
		
		in.close();
	}
	
	public static void printMenu()
	{
		System.out.println("Command Options");
		System.out.println("-----------------------------------");
		System.out.println("A: Sort by Name");
		System.out.println("B: Sort by Due Date");
		System.out.println("C: Sort by Description");
		System.out.println("D: Sort by Priority");
		System.out.println("E: Sort by Status");
		System.out.println("F: Print Projects");
		System.out.println("Q: Quit");
	} 
}