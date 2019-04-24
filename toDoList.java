package javafxapplication1.newpackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;



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
	
	public String getListofItems()
	{
		String listStr="";
		toDoItem sorted=this.head;
		while(sorted!=null)
		{
                    listStr+="\n";
				listStr+=sorted.printInfo();
				
                                sorted=sorted.next;
		}
	return listStr;
	}
        public String getEachItem(toDoItem head)
        {
                String listStr="";
		toDoItem sorted=head;
                listStr+="\n";
                listStr+=sorted.printInfoNaked();
                return listStr;
        }
	/*
	@param: changeParam: contains inforomation on which parameter to 
	change the item by. 
	*/
	public void changeItem(toDoItem newItem, String changeParam)
	{
            /*
		String searchBy="";
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
				
		}*/
	}
	public void saveList(String fileName)
	{
            String s="";
		try{
			
		final String dir = System.getProperty("user.dir");
                System.out.println(dir+"\\"+fileName+".txt");
		 File FN = new File(dir+"\\"+fileName+".txt");
                 String saveStr=this.getListofItems();
                 
		 FileOutputStream is = new FileOutputStream(FN);
		OutputStreamWriter osw = new OutputStreamWriter(is);    
			BufferedWriter w = new BufferedWriter(osw);
                        toDoItem item=this.head;
                        do
                        {
                            s=this.getEachItem(item);
                            
                           
                             w.write(item.taskName);
                            w.newLine();
                             w.write(item.dueDate);
                            w.newLine();
                             w.write(item.jobDesc);
                            w.newLine();
                            w.write(Integer.toString(item.getPriority()));
                            w.newLine();
                             w.write(item.getStatusVal());
                            w.newLine();
                            item=item.next;
                            
                        }
                        while(item!=null); 
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
                toDoList openedList=new toDoList();
                String iter="";
                final String dir = System.getProperty("user.dir");
			 String FN =(dir+"\\"+fileName+".txt");
                         try
                         {
                             Scanner opener= new Scanner(new File(FN));
                             while(opener.hasNext())
                             {
                                 String taskName=opener.next();
                                 String dueDate=opener.next();
                                 String jobDesc=opener.next();
                                 String priority=opener.next();
                                 String status=opener.next();
                                 this.addItem(numberOfItems, taskName, dueDate, jobDesc);
                             }
                         }
                         catch(Exception e)
                         {
                          System.out.println("unable to open list");                         
                         }
                         
                         
    
        }
        
        public void printList()
        {
            String l= this.getListofItems();
            System.out.println(l);
        }
	public static void main (String [] args)
	{
            Scanner scan = new Scanner(System.in);
		toDoList l= new toDoList();
		
                l.addItem(99, "desc", "dd", "job name");
         
           
	
                l.getListofItems();
		l.printList();
                System.out.println("Input save file name");
                String FN =scan.next();
                l.saveList(FN);
                l.loadList(FN);
                l.printList();
	}

}
