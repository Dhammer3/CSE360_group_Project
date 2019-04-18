package GUIProject;

import java.util.LinkedList;

public class Sorter 
{
	private String name;
	private String description;
	private int priority;
	private int dueDate;
	private Status status;
	LinkedList<String> projects = new LinkedList<String>();
	
	public Sorter(String projectName, String projectDescription, int projectPriority, int projectDueDate, Status projectStatus)
	{
		name = projectName;
		description = projectDescription;
		priority = projectPriority;
		dueDate = projectDueDate;
		status = projectStatus;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public int getPriority() 
	{
		return priority;
	}

	public void setPriority(int priority) 
	{
		this.priority = priority;
	}

	public int getDueDate() 
	{
		return dueDate;
	}

	public void setDueDate(int dueDate)
	{
		this.dueDate = dueDate;
	}

	public Status getProjectStatus()
	{
		return status;
	}

	public void setProjectStatus(Status status) 
	{
		this.status = status;
	}
	
}
