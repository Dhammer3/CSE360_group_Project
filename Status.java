package GUIProject;

public class Status 
{
	private String currentStatus;
	private int statusOrder;
	
	public Status(String status, int order)
	{
		currentStatus = status;
		statusOrder = order;
	}
	
	public String getStatus()
	{
		return currentStatus;
	}
	
	public int getOrder()
	{
		return statusOrder;
	}
	
	public void setStatus(String status)
	{
		currentStatus = status;
	}
	
	public void setOrder(int order)
	{
		statusOrder = order;
	}
}
