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
				this.sort(this.head);
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

	public void getListofItems()
	{
		String listStr="";
		toDoItem sorted=this.head;
		while(sorted.next!=null)
		{
				listStr+=sorted.getInfo();
				listStr+="\n";
		}
	return listStr;
	}
	/*
	@param: changeParam: contains inforomation on which parameter to 
	change the item by. 
	*/
	public void changeItem(toDoItem newItem, String changeParam)
	{
		String searchBy=""
		switch(changeParam)
		{
			case "D":
			toDoItem temp = this.head();
				while(temp!=null)
				{
					if(temp.getDueDate==newItem.getDueDate)
					{
						temp=newItem;
					}
					temp=temp.next;
				}
			case ""

			
			case default:
				
		}
	}
	public void saveList(String fileName)
	{
		try{
			
		final String dir = System.getProperty("user.dir");
		String saveStr=this.getListofItems();
		 File FN = new File(dir+"/"+fileName+".txt");
		 FileOutputStream is = new FileOutputStream(FN);
		OutputStreamWriter osw = new OutputStreamWriter(is);    
			Writer w = new BufferedWriter(osw);
			w.write(saveStr);
			w.close();
		}
		//create new file and write to it here
		catch(IOException e)
		{
			System.out.println("There was a problem writing to the file");
		}
	}
	public void loadList(String fileName)
	{
			final String dir = System.getProperty("user.dir");
			 File FN = new File(dir+"/"+fileName+".txt");
			 
			
	}
	public static void main (String [] args)
	{
		toDoList l= new toDoList();
		l.addItem(1, "a", "b", "c" );
		l.printList();
		l.addItem(2, "g", "h", "k" );
		l.addItem(3, "e", "h", "j" );
		l.addItem(-11, "m", "bn", "c" );

		l.printList();
	}

}
