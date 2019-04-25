package javafxapplication1;



public class toDoItem {

	int priority;
	String jobDesc;
	String dueDate;
	String taskName;
	String status;
        int statusNum;
	String[] statusList= {"not started", "in progress","finished"};
	toDoItem next;
	toDoItem prev;
        int position;
	public toDoItem()
	{
		this.priority=0;
		this.jobDesc=null;
		this.dueDate=null;
		this.taskName=null;
		this.status=null;
		this.next=null;
		this.prev=null;
	}
	public toDoItem(int priority, String jobDesc, String dueDate, String taskName)
	{
		this.priority=priority;
		this.taskName=jobDesc;
		this.dueDate=dueDate;
		this.jobDesc=taskName;
		this.status=this.statusList[0];
		this.next=null;
		this.prev=null;
	}
        public void setTaskName(String taskName)
	{
		this.taskName=taskName;
	}
         public void setDueDate(String dueDate)
	{
		this.dueDate=dueDate;
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
	public void setDesc(String taskName)
	{
		this.taskName=taskName;
	}
	public void setStatus(int stat)
	{
		this.status=this.statusList[stat];
                this.statusNum=stat;
	}
	public String getStatus()
	{
		return this.status;
	}
        public int getStatusNum()
        {
            return this.statusNum;
        }
	public int getPriority()
	{
		return this.priority;
	}
	public String getJobDesc()
	{
		return this.jobDesc;
	}
	public String getDueDate()
	{
		return this.dueDate;
	}
	public String getTaskName()
	{
		return this.taskName;
	}
        public String getStatusVal()
	{
          return Integer.toString(statusNum);
	}
        public void setPosition(int x)
        {
            this.position=x;
        }
        public int getPostion()
        {   
            return this.position;
        }
         public int getDisplayPosition()//hide it hehe
        {   if(this.statusNum==2)
            {
             return this.position+30;
                }
        else
        {
           return this.position;
        }
         }

	public String printInfo()
	{
		String info="";
		info+=" Priority: "+this.getPriority()+"\n";
		info+=" Job Description: "+this.getJobDesc()+"\n";
		info+=" Due Date: "+this.getDueDate()+"\n";
		info+=" Task Name: "+this.getTaskName()+"\n";
		info+=" Status: "+this.getStatus()+"\n";
		return info;
	}
        public String printInfoNaked()
	{
            String info="";
		info+=this.getPriority()+"\n";
		info+=this.getJobDesc()+"\n";
		info+=this.getDueDate()+"\n";
		info+=this.getTaskName()+"\n";
		info+=this.getStatusVal()+"\n";
		return info;
        }

    int compareTo(toDoItem get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}