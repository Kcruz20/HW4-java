package HW4_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.URL;

	public class yahtzee 
	{
		 public static boolean stop= false;
		 Rand[] ran = new Rand[5];
		 
			public yahtzee()
			{	
			JFrame frame = new JFrame("Yahtzee");
		    frame.setSize(1000, 500);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setLayout(new FlowLayout());
		    frame.setVisible(true);
		    
		    
		    JButton btn = new JButton("Stop");
		    frame.add(btn);
		    
		    for (int i=0; i<5; i++) 
		    {
		        JLabel l = new JLabel();
		        ran[i] = new Rand(l);
		        frame.add(l);
		    }
		    
		    btn.addActionListener(new ActionListener()
		    {
				public void actionPerformed(ActionEvent e) 
				{
					if (stop ==false)
					{
						for (int i = 0; i < 5; i++)
						stop = true;				
						}
					}	
				});

		    Thread[] ts = new Thread[5];
		    for (int i=0; i<5; i++) 
		    {
		        ts[i] = new Thread(ran[i]);
		        ts[i].start();
		       
		        try 
		        {
		            Thread.sleep(10);

		        }
		        catch (InterruptedException ex) {;}
		    }
		    
		    
			}
			
			/**
			 * @param args
			 */
			public static void main(String[] args ){
				yahtzee dice = new yahtzee();
			}
			

		}

