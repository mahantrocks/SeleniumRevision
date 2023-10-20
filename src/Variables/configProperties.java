package Variables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configProperties {
	
	public static Properties property;
	
	private static String path ="Configuration/config.properties";
	
	public static void initializationPropertyFile() throws FileNotFoundException  {
		property = new Properties ();
	FileInputStream input = new FileInputStream(path);	
	try {
		property.load(input);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

}
}
