package group_project;



public class toDoList {

	int numberOfItems;
	toDoItem head;
	toDoItem sorted;

	//toDoItem tail;
	public toDoList()
	{
		int numberOfItems=0;
		//this.next=null;
		head=null;
		sorted=null;
	
	}
	public void deleteItem(String jobDesc)
	{
		toDoItem n=head;
		int counter=0;
		while(n.next!=null)
		{
			
			n=n.next;
			counter++;
		}
	}
	public boolean addItem(int priority, String jobDesc, String dueDate, String desc)
	{
		toDoItem nextItem=new toDoItem (priority, jobDesc, dueDate, desc);
		boolean alreadyInList=false;
		boolean conflictingPriority=false;

		if(head==null)
		{
			head=nextItem;
			head.next=null;
		}
		else
		{
			toDoItem n=head;
			while(n.next!=null)
			{
				if(n.getjobDesc()==jobDesc)
				{
					alreadyInList=true;
	
				}
				if(n.getPriority()==priority)
				{
					conflictingPriority=true;
				}
					n=n.next;	
			}
			if(n.getjobDesc()==jobDesc)
			{
				alreadyInList=true;
			}
			if(n.getPriority()==priority)
			{
				conflictingPriority=true;
			}
			if(!alreadyInList && !conflictingPriority)
			{
				n.next=nextItem;
				n.next.next=null;
				this.numberOfItems+=1;
				return true;
			}
			
				
			
		}
		return false;
		
	}
	public void insertionSort(toDoItem head)
	{
		toDoItem sorted=null;
		toDoItem current=head;
		
		while(current!=null)
		{
			toDoItem next = current.next;
			sort(current);
			current=next;
		}
		head=sorted;
	}
	public void sort(toDoItem newItem)
	{
		if(sorted==null||sorted.priority>=newItem.priority)
		{
			newItem.next=sorted;
			sorted=newItem;
		}
		else
		{
			toDoItem current=sorted;
			while(current.next!=null && current.next.priority<=newItem.priority)
			{
				current=current.next;
			}
			newItem.next=current.next;
			current.next=newItem;
			
		}
	}
	public void changeItem(toDoItem newItem, String changeParam)
	{
		
	}
	public void printList()

	{
		toDoItem sorted=this.head;
		while(sorted.next!=null)
		{
			System.out.println(sorted.printInfo());
			sorted=sorted.next;
		}
		System.out.println(sorted.printInfo());
	}
	public void saveList()
	{
		
	}
	
}
