package HW4_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;


public class Spider {
public static Map<String, Boolean> websites = new HashMap<String, Boolean>();
public String[] Spider1 = {"http://www.whitworthpirates.com/"};

/*public Spider()
{
	setSize(800,800);
	setDeafaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	this.setVisible(true);
}
*/

public static void main(String[] args){
	websites.put("http://www.whitworthpirates.com/", false);
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(null));
			String line;
			while((line = reader.readLine()) != null)
			{
				Pattern pattern = Pattern.compile("<a\\s*?href=\"(http:.*?)\"");
				Matcher matcher = pattern.matcher(line);
				if(matcher.find())
				{
					websites.put(matcher.group(1), false);
					System.out.printf("url: %s\n", matcher.group(1));
				}
			}
		}
		catch(Exception e)
		{
			System.out.printf("Error! %s", e.getMessage());
		}
	
	}
}
	

