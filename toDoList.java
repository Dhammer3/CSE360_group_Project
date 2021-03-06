package javafxapplication1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;



public class toDoList {

	int numberOfItems;
	LinkedList<toDoItem> list = new LinkedList<toDoItem>();
	
	public toDoList()
	{
		int numberOfItems=0;
	}
  
	public void deleteItem(int row)
	{
            for(int i=0; i<numberOfItems; i++)
            {
                if(list.get(i).getPostion()==row)
                {
                    list.remove(i);
                    numberOfItems-=1;
      
                }
            }
            this.sortByPriority();
	}
	public void sortByStatus()
        {
            list.sort(Comparator.comparing(toDoItem::getStatusNum));
            for(int i=0; i<numberOfItems; i++)
            {
                list.get(i).setPosition(i);
            }
        }
	public void sortByDueDate()
	{
              list.sort(Comparator.comparing(toDoItem::getDueDate));
              for(int i=0; i<numberOfItems; i++)
            {
                list.get(i).setPosition(i);
            }
	}
	public void sortByTaskName()
	{
            toDoItem temp= new toDoItem();
            toDoItem temp2= new toDoItem();
       for (int i = 0; i < numberOfItems; i++) 
        {
            for (int j = i + 1; j < numberOfItems; j++) 
            {
                if (list.get(i).compareTo(list.get(j))>0) 
                {
                   temp = list.get(i);
                   temp2=list.get(j);
                    list.remove(i);
                    list.remove(j);
                    list.add(i, temp2);
                    list.add(j, temp);
              
                 
                }
            }
        }
          for(int i=0; i<numberOfItems; i++)
            {
                list.get(i).setPosition(i);
            }
      
	}
        public void sortByJobDesc()
	{
            list.sort(Comparator.comparing(toDoItem::getJobDesc));
            for(int i=0; i<numberOfItems; i++)
            {
                list.get(i).setPosition(i);
            }
	}
	public void sortByPriority()
	{
            list.sort(Comparator.comparing(toDoItem::getPriority));
            for(int i=0; i<numberOfItems; i++)
            {
                list.get(i).setPosition(i);
            }
	}
	
	public boolean addItem(int priority, String jobDesc, String dueDate, String desc)
	{
		toDoItem nextItem=new toDoItem (priority, jobDesc, dueDate, desc);
		boolean alreadyInList=false;
		boolean conflictingPriority=false;

		for(int i=0; i<numberOfItems; i++)
                {
                    if(list.get(i).getStatusNum()!=2)
                    {
                    if(((list.get(i).getJobDesc().compareTo(desc))==0)||(list.get(i).getPriority()==priority))
                    {
                        return false;
                    }
                    }
                }
                this.numberOfItems+=1;
                list.add(nextItem);
                this.sortByPriority();
                return true;
	}

	public String getListofItems()
	{
		String listStr="";
		for(int i=0; i<list.size(); i++)
		{
                                listStr+="\n";
				listStr+=list.get(i).printInfo();
			
		}
	return listStr;
	}
        public toDoItem getEachItem(int position)
        {
            toDoItem temp = new toDoItem();
            temp=list.get(position);
            return temp;
        }
	/*
	@param: changeParam: contains inforomation on which parameter to
	change the item by.
	*/
	public boolean changeItem(String taskName, String dueDate, String desc, String priority, String Status)
	{
            try
            {
                
            int p=Integer.parseInt(priority);
            int s=Integer.parseInt(Status);
           for(int i=0; i<numberOfItems; i++)
           {
              if((list.get(i).getTaskName().equals(taskName)))
              {
                  System.out.println("------------------------------------------------");
                list.get(i).dueDate(dueDate);
                list.get(i).jobDesc(desc);
                list.get(i).setPriority(p);
                list.get(i).setStatus(s);
             this.sortByPriority();
             return true;
              }
              
          }
            }
            catch(Exception e)
            {
                    System.out.println("000000000000000000000000000000");
                return false;
            }
         return false;
	}
	public boolean printList(String fileName)
	{
            if(fileName=="")
            {
                return false;
            }
            String s="";
		try{

		final String dir = System.getProperty("user.dir");
                System.out.println(dir+"\\"+fileName+".txt");
		 File FN = new File(dir+"\\"+fileName+".txt");
                 String saveStr=this.getListofItems();

		 FileOutputStream is = new FileOutputStream(FN);
		OutputStreamWriter osw = new OutputStreamWriter(is);
			BufferedWriter w = new BufferedWriter(osw);
                        toDoItem item = new toDoItem();
                        int counter=0;
                        do
                        {
                            item=this.getEachItem(counter);
                            w.write("Event Name: ");
                             w.write(item.taskName);
                            w.newLine();
                            w.write("Due Date: ");
                             w.write(item.dueDate);
                            w.newLine();
                            w.write("Description: ");
                             w.write(item.jobDesc);
                            w.newLine();
                            w.write("Priority: ");
                            w.write(Integer.toString(item.getPriority()));
                            w.newLine();
                            w.write("Status: ");
                            w.write(item.getStatus());
                            w.newLine();
                            w.newLine();
                           counter++;
                        }
                        while(counter!=numberOfItems);
			w.close();
                        
		}
		//create new file and write to it here
		catch(IOException e)
		{
			return false;
		}
                return true;
	}
	
	
	public boolean saveList(String fileName)
	{
            if(fileName=="")
            {
                return false;
            }
            String s="";
		try{

		final String dir = System.getProperty("user.dir");
                System.out.println(dir+"\\"+fileName+".txt");
		 File FN = new File(dir+"\\"+fileName+".txt");
                 String saveStr=this.getListofItems();

		 FileOutputStream is = new FileOutputStream(FN);
		OutputStreamWriter osw = new OutputStreamWriter(is);
			BufferedWriter w = new BufferedWriter(osw);
                        toDoItem item = new toDoItem();
                        int counter=0;
                        do
                        {
                            item=this.getEachItem(counter);
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
                            w.newLine();
                           counter++;
                        }
                        while(counter!=numberOfItems);
			w.close();
                        
		}
		//create new file and write to it here
		catch(IOException e)
		{
			return false;
		}
                return true;
	}

	public boolean loadList(String fileName)
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
                                int p=Integer.parseInt(priority);
                                 String status=opener.next();
                                 this.addItem(p, taskName, dueDate,jobDesc);
                             }
                         }
                        
                         catch(Exception e)
                         {
                          return false;
                         }
                             return true;
        }
        public void deleteALL()
        {
                list.clear();
              //. this.numberOfItems=0;
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
                l.addItem(99, "desc", "dd", "b");
                l.addItem(1, "a", "dd", "e");
                l.addItem(2, "b", "dd", "d");
                l.addItem(-1, "c", "dd", "a");//having trouble adding this item to the list.
                l.printList();
      
        
                l.printList();

	}

}
