package cse360assign4;

import org.w3c.dom.Node;

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
				
			}
			
			
		}
		
		
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
	public void changeItem(int priority, String jobDesc, String dueDate, String desc)
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
	public static void main (String [] args)
	{
		toDoList list=new toDoList();
		list.addItem(0, "job", "some date", "some desc");
		list.addItem(3, "job7", "some date", "some desc");
		list.addItem(1, "job2", "some date", "some desc");
		list.addItem(2, "job3", "some date", "some desc");
		list.addItem(3, "job3", "some date", "some desc");
		list.addItem(-1, "job5", "some date", "some desc");
		list.printList();
		toDoItem sorted=list.head;
		list.insertionSort(sorted);
		System.out.println("after insertion sort");
		list.printList();
	}
}
