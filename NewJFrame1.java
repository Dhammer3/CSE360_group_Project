/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author ralgham1
 */

public class NewJFrame1 extends javax.swing.JFrame {
int row=0;
toDoList to_do_list=new toDoList();
    private JLabel jLabel0;


    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

	 jLabel0 = new javax.swing.JLabel();


       jLabel1 = new javax.swing.JLabel();
	 jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


/*jLabel0.setText("Event Name");
jLabel0.setBounds(290,-26,90,90);
add(jLabel0);
jLabel0.addMouseListener(new MouseAdapter(){ 
	public void mouseClicked(MouseEvent e){  
       System.out.println("IT WORKS!!");
    }  
}); 	
*/




        jLabel1.setText("Event Name");
	

	jLabel2.setText("Due Date");
	

        jLabel3.setText("Description");

        jLabel4.setText("Priority");
        toDoList to_do_list= new toDoList();
        jButton1.setText("Add");
	jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
	jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Change");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Display");
	jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Print Report");
	jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton6.setText("Save");
	jButton6.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
	     }
	});

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
               {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                 {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
               {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                 {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
            },
            new String [] {
                "Event Name", "Due Date", "Priority", "Description", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
	jTable1.setDefaultEditor(Object.class, null);
        jButton7.setText("Restore");
	jButton7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
	     }
	});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed




//private void jLabel1ActionPerformed(java.awt.event.ActionEvent evt) {
//		System.out.println("the event name label was pressed");


	// TODO add your handling code here:
   // }

   
 public void mouseClicked(MouseEvent e) {
         System.out.println("the label listener works!!");
      }




   //add button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    String taskName = jTextField1.getText();  // what ever is in the Event name textfield box is put into variable addName
    Date date = jDateChooser1.getDate();     // what ever is in the Due Date textfield box is put into variable addDate
    String description = jTextField2.getText();  // what ever is in the Description textfield box is put into variable addDescription
    String priority = jTextField3.getText();     // what ever is in the Priority textfield box is put into variable addPriority
    
    try
            {
               int addPriority=Integer.parseInt(priority); 
                 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
    
            String strDate = dateFormat.format(date);  
            if(to_do_list.addItem(addPriority,taskName,strDate,description))
        {
            this.setcorrectPosition();
    }
            else
            {
                JOptionPane.showMessageDialog(null, "Could not add item, conflicting priority or item description exists already.", "ERROR", JOptionPane.WARNING_MESSAGE);
                //display error message here "could not add item, conflicting priority or item description exists already. 
            }
          }
   
    catch(Exception e)
    {JOptionPane.showMessageDialog(null, "Priority must be an integer.", "ERROR", JOptionPane.WARNING_MESSAGE);
        //display error message here "priority must be an integer"
    }
    }
     private void setcorrectPosition()
    {
        String blank=null;
         for(int i=0; i<to_do_list.numberOfItems+1; i++)
                {
		jTable1.setValueAt(blank, i, 0);      // this sets what is at the selected row, and at column 0 with the blank, which is " "
                jTable1.setValueAt(blank, i, 1);      // this sets what is at the selected row, and at column 1 with the blank, which is " "
		jTable1.setValueAt(blank, i, 2);      // this sets what is at the selected row, and at column 2 with the blank, which is " "
		jTable1.setValueAt(blank, i, 3);      // this sets what is at the selected row, and at column 3 with the blank, which is " "
                jTable1.setValueAt(blank, i, 4);
              
                }
        for(int i=0; i<to_do_list.numberOfItems;i++)
        {
            
                 to_do_list.list.get((i)).getDisplayPosition();
       
            jTable1.setValueAt(to_do_list.list.get((i)).getTaskName(),to_do_list.list.get((i)).getDisplayPosition(), 0);
             jTable1.setValueAt(to_do_list.list.get((i)).getDueDate(),to_do_list.list.get((i)).getDisplayPosition(), 1);
              jTable1.setValueAt(to_do_list.list.get((i)).getPriority(),to_do_list.list.get((i)).getDisplayPosition(), 2);
               jTable1.setValueAt(to_do_list.list.get((i)).getJobDesc(),to_do_list.list.get((i)).getDisplayPosition(), 3);
               jTable1.setValueAt(to_do_list.list.get((i)).getStatus(),to_do_list.list.get((i)).getDisplayPosition(), 4);
            
          
        }
            /*
    jTable1.setValueAt(taskName, row,0);             //the name is being placed at row 0, column 0
    jTable1.setValueAt(strDate, row,1);             //the date is being placed at row 0, column 1
    jTable1.setValueAt(priority, row,2);         //the prority is being placed at row 0, column 2
    jTable1.setValueAt(description, row,3);      //the description is being placed at row 0, column 3
            */
    }
      private void printRPT()
    {
        for(int i=0; i<to_do_list.numberOfItems;i++)
        {
            
         
            jTable1.setValueAt(to_do_list.list.get((i)).getTaskName(),to_do_list.list.get((i)).getPostion(), 0);
             jTable1.setValueAt(to_do_list.list.get((i)).getDueDate(),to_do_list.list.get((i)).getPostion(), 1);
              jTable1.setValueAt(to_do_list.list.get((i)).getPriority(),to_do_list.list.get((i)).getPostion(), 2);
               jTable1.setValueAt(to_do_list.list.get((i)).getJobDesc(),to_do_list.list.get((i)).getPostion(), 3);
               jTable1.setValueAt(to_do_list.list.get((i)).getStatus(),to_do_list.list.get((i)).getPostion(), 4);
            
               
        }
            /*
    jTable1.setValueAt(taskName, row,0);             //the name is being placed at row 0, column 0
    jTable1.setValueAt(strDate, row,1);             //the date is being placed at row 0, column 1
    jTable1.setValueAt(priority, row,2);         //the prority is being placed at row 0, column 2
    jTable1.setValueAt(description, row,3);      //the description is being placed at row 0, column 3
            */
    }
 
    



                // ****the rows in this part will need to be able to change in the future****
    

	// TODO add your handling code here:
    
private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

        this.setcorrectPosition();

}



private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
this.printRPT();
}





//Delete button
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		String blank = null;                 // this is "deleting the row, it is actually replacing everything with a space
	  int row = jTable1.getSelectedRow();         // this detects what row is currently being selected and puts that value in to row
		//int column = jTable1.getSelectedColumn();       // this detects what column is currently being selected and puts that value in to column
               to_do_list.deleteItem(row);
             
                for(int i=0; i<to_do_list.numberOfItems+1; i++)
                {
		jTable1.setValueAt(blank, i, 0);      // this sets what is at the selected row, and at column 0 with the blank, which is " "
                jTable1.setValueAt(blank, i, 1);      // this sets what is at the selected row, and at column 1 with the blank, which is " "
		jTable1.setValueAt(blank, i, 2);      // this sets what is at the selected row, and at column 2 with the blank, which is " "
		jTable1.setValueAt(blank, i, 3);      // this sets what is at the selected row, and at column 3 with the blank, which is " "
                jTable1.setValueAt(blank, i, 4);
                 this.setcorrectPosition();
                }
                 this.setcorrectPosition();
// TODO add your handling code here:
    }

//change button 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int row = jTable1.getSelectedRow();         // this detects what row is currently being selected and puts that value in to row
    int column = jTable1.getSelectedColumn();       // this detects what column is currently being selected and puts that value in to column
		
      /*          try
                {
                     String change = String.valueOf(jTable1.getValueAt(row, column)); // this stores the specific thing that is at the row and column what was selected
               to_do_list.changeItem(change, row, column);
                System.out.println(change);
                this.setcorrectPosition();
                }
                catch(Exception e)
                {
                    System.out.println("Error updating");
                }
               
   */
                
              //JPanel p = new JPanel(new BorderLayout(5,5));

       JPanel panel = new JPanel(new BorderLayout(5, 5));

    JPanel label = new JPanel(new GridLayout(0, 1, 2, 2));
    label.add(new JLabel("Event Name", SwingConstants.RIGHT));
    label.add(new JLabel("Due Date", SwingConstants.RIGHT));
     label.add(new JLabel("Description", SwingConstants.RIGHT));
      label.add(new JLabel("Priority", SwingConstants.RIGHT));
       label.add(new JLabel("Status", SwingConstants.RIGHT));
    
    panel.add(label, BorderLayout.WEST);

    JPanel controls = new JPanel(new GridLayout(0, 1, 2, 2));
    
    JTextField eventName = new JTextField();
    controls.add(eventName);

    
     JTextField dueDate = new  JTextField ();
    controls.add(dueDate);
   
    
     JTextField description = new  JTextField ();
    controls.add(description);
 
    
     JTextField  priority = new  JTextField ();
    controls.add(priority);
    
    //int p=0;
  // p=Integer.parseInt(des);
    
     JTextField  status = new  JTextField ();
     //status.setText("Enter 0 for not started, 1 for started, 2 for compeleted");
    controls.add(status);
     
    //int s=Integer.valueOf(stat);
//    
//     System.out.println(name);
//     System.out.println(date);
//     System.out.println(des);
//     System.out.println(prior);
//       System.out.println(stat);


     
    panel.add(controls, BorderLayout.CENTER);

    JOptionPane.showMessageDialog(null, panel, "Change", JOptionPane.INFORMATION_MESSAGE);
       String name = eventName.getText();
        String date = dueDate.getText();
            String des = description.getText();
             String prior = priority.getText();
             String stat = status.getText(); 
             if(to_do_list.changeItem(name, date, des, prior, stat))
             {
                    this.setcorrectPosition();
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "Could not find item by that task name.", "ERROR", JOptionPane.WARNING_MESSAGE);
                 //"could not find item by that task name"
             }
               

      

   
                
                
                
   /* String addName = jTextField1.getText();  // what ever is in the Event name textfield box is put into variable addName
    Date addDate = jDateChooser1.getDate();     // what ever is in the Due Date textfield box is put into variable addDate
		String addDescription = jTextField2.getText();  // what ever is in the Description textfield box is put into variable addDescription		String addPriority = jTextField3.getText();     // what ever is in the Priority textfield box is put into variable addPriority

                if (column ==0){
                jTable1.setValueAt(addName, row,column);
                }

                 if (column ==1){
                jTable1.setValueAt(addDate, row,column);
                 }

                if (column ==2){
		jTable1.setValueAt(addPriority, row,column);
                }

                 if (column ==3){
		jTable1.setValueAt(addDescription, row,column);
                 }

*/


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
         JFrame B6 = new JFrame();
      String save="";
     save = JOptionPane.showInputDialog(B6, "Enter save file name:");
    
    if(!(save==""))
    {
        if(to_do_list.saveList(save)){
            System.out.println("Saved to file");
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Unable to save file.", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }
  
    }
    
    
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
         JFrame B7 = new JFrame();
      String load="";
     load = JOptionPane.showInputDialog(B7, "Enter save file name:");
    
    if(!(load==""))
    {
        to_do_list.deleteALL();
        
        if(to_do_list.loadList(load))
        {
            this.setcorrectPosition();
            System.out.println("loaded the file");
            
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Unable to load file.", "ERROR", JOptionPane.WARNING_MESSAGE);
               
            //need errro message here "unable to load file"
        }
        
  
    }
    }
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
