package filewrite;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Save {
	 public static void main( String[] args )
	    {
	        Properties prop = new Properties();
	 
	        try {
	            //set the properties value
	            prop.setProperty("host_name", "localhost");
	            prop.setProperty("user_id", "jeffer");
	            prop.setProperty("bpassword", "samplecode");
	 
	            //save properties to project root folder
	            prop.store(new FileOutputStream("myjdbc.properties"), null);
	 
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }
	 
	}



