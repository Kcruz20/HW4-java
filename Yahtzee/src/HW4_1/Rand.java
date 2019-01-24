package HW4_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.util.Random;

public class Rand implements Runnable 
{
    private JLabel _label;
	Image image1, image2, image3, image4, image5, image6;
	ImageIcon icon1, icon2, icon3, icon4, icon5, icon6;
	
  
    public Rand(JLabel label) 
    {
    	try
    	{
    	
    	URL imgURL = new URL ("http://www.clker.com/cliparts/9/u/S/1/o/A/red-die-1-md.png");           
    	Image image1 = Toolkit.getDefaultToolkit().getImage(imgURL);
    	image1 = image1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
    	
    	URL imgURL2 = new URL ("http://www.clker.com/cliparts/N/e/8/O/Z/G/red-die-2-md.png");
    	Image image2 = Toolkit.getDefaultToolkit().getImage(imgURL2);
    	image2 = image2.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
    	
    	URL imgURL3 = new URL ("http://www.clker.com/cliparts/Y/3/S/S/N/8/red-die-3-md.png");
    	Image image3 = Toolkit.getDefaultToolkit().getImage(imgURL3);
    	image3 = image3.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
    	
    	URL imgURL4 = new URL ("http://www.clker.com/cliparts/T/1/G/i/B/E/red-die-4-th.png");
    	Image image4 = Toolkit.getDefaultToolkit().getImage(imgURL4);
    	image4 = image4.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
    	
    	URL imgURL5 = new URL ("http://www.clker.com/cliparts/p/N/w/Z/Q/C/red-die-5-md.png");
    	Image image5 = Toolkit.getDefaultToolkit().getImage(imgURL5);
    	image5 = image5.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
      	
    	URL imgURL6 = new URL ("http://www.clker.com/cliparts/S/l/9/h/O/4/red-die-9-md.png");
    	Image image6 = Toolkit.getDefaultToolkit().getImage(imgURL6);
    	image6 = image6.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
    	
    	 icon1 = new ImageIcon(image1);
    	 icon2 = new ImageIcon(image2);
    	 icon3 = new ImageIcon(image3);
    	 icon4 = new ImageIcon(image4);
    	 icon5 = new ImageIcon(image5);
    	 icon6 = new ImageIcon(image6);
        _label = label;
        
    	}
    	catch (Exception ex){;}
    }

    public void run() 
    {
    	ImageIcon icons[] = {icon1, icon2, icon3, icon4, icon5, icon6 };
    	Random random = new Random();
    	int i;
    
    	while(yahtzee.stop == false)
    	{
    		i = random.nextInt(6);
    		_label.setIcon(icons[i]);
            try 
            {
                Thread.sleep(100);  
            }
            catch (InterruptedException ex) {;} 
    	} 

       }
   }
 



