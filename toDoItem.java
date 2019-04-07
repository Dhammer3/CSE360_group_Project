package cse360assign4;

public class toDoItem {

	int priority;
	String jobDesc;
	String dueDate;
	String desc;
	String status;
	String[] statusList= {"not started", "in progress","finished"};
	toDoItem next;
	toDoItem prev;
	public toDoItem()
	{
		this.priority=0;
		this.jobDesc=null;
		this.dueDate=null;
		this.desc=null;
		this.status=null;
		this.next=null;
		this.prev=null;
	}
	public toDoItem(int priority, String jobDesc, String dueDate, String desc)
	{
		this.priority=priority;
		this.jobDesc=jobDesc;
		this.dueDate=dueDate;
		this.desc=desc;
		this.status=this.statusList[0];
		this.next=null;
		this.prev=null;
	}
	public void setPriority(int priority)
	{
		this.priority=priority;
	}
	public void jobDesc(String jobDesc)
	{
		this.jobDesc=jobDesc;
	}
	public void dueDate(String dueDate)
	{
		this.dueDate=dueDate;
	}
	public void setDesc(String desc)
	{
		this.desc=desc;
	}
	public void setStatus(int stat)
	{
		this.status=this.statusList[stat];
	}
	public String getStatus()
	{
		return this.status;
	}
	public int getPriority()
	{
		return this.priority;
	}
	public String getjobDesc()
	{
		return this.jobDesc;
	}
	public String getDueDate()
	{
		return this.dueDate;
	}
	public String getDesc()
	{
		return this.desc;
	}

	public String printInfo()
	{
		String info="";
		info+="Priority: "+this.getPriority()+"\n";
		info+="Job Description: "+this.getjobDesc()+"\n";
		info+="Due Date: "+this.getDueDate()+"\n";
		info+="nStatus: "+this.getStatus()+"\n";
		return info;
	}
}
