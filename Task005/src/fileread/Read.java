package fileread;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read {
	 public static void main( String[] args )
	    {
	        Properties prop = new Properties();
	 
	        try {
	            //load a properties file
	            prop.load(new FileInputStream("myjdbc.properties"));
	 
	            //get the property value and print it out
	            System.out.println(prop.getProperty("host_name"));
	            System.out.println(prop.getProperty("user_id"));
	            System.out.println(prop.getProperty("password"));
	 
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }
	   
}
  
