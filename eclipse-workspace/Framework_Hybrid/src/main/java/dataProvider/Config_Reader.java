 package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader

{
	
	public static String getProperty(String key)
	{
		Properties pro=new Properties();
		
		try {
			pro.load(new FileInputStream(new File(System.getProperty("user.dir")+"/Config/config.properties")));
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Could not find the property file"+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not load the property file"+e.getMessage());
		}
		String value=pro.getProperty(key);
		return value;
	}

}
