package cse360assign4;

import org.w3c.dom.Node;

public class toDoList {

	int numberOfItems;
	toDoItem head;


	//toDoItem tail;
	public toDoList()
	{
		int numberOfItems=0;
		//this.next=null;
		head=null;
	
	}
	public void deleteItem(String jobDesc)
	{
		
	}
	public void addItem(int priority, String jobDesc, String dueDate, String desc)
	{
		toDoItem nextItem=new toDoItem(priority, jobDesc,dueDate,desc);
		boolean alreadyInList=false;
		boolean conflictingPriority=false;
		//String alreadyInList="This item is already in your list! Unable to add the Item";
		//String conflictingPriority="This item has a conflicting priority! Unable to add the Item";
		
		//nextItem=this.head.next;
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
				else
				{
					n=n.next;
				}
				
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
			}
			
			
		}
		
		
	}
	public void sortList()
	{
		
	}
	public void changeItem(int priority, String jobDesc, String dueDate, String desc)
	{
		
	}
	public void printList()
	{
		while(head.next!=null)
		{
			System.out.println(head.printInfo());
			head=head.next;
		}
		System.out.println(head.printInfo());
	}
	public static void main (String [] args)
	{
		toDoList list=new toDoList();
		list.addItem(0, "job", "some date", "some desc");
		list.addItem(0, "job", "some date", "some desc");
		list.addItem(1, "job2", "some date", "some desc");
		list.addItem(3, "job3", "some date", "some desc");
		list.addItem(3, "job3", "some date", "some desc");
		list.printList();
	}
}
