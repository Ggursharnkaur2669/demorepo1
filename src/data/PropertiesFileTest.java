package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f=new FileInputStream("C:\\Users\\gursh\\Desktop\\QATester\\Pratice_Testing\\prop.properties");
		Properties p=new Properties();
		p.load(f);
		
		System.out.println(p.getProperty("browser"));
		
		
		
		FileOutputStream i=new FileOutputStream("C:\\Users\\gursh\\Desktop\\QATester\\Pratice_Testing\\prop.properties");
		p.setProperty("language","Java");
		System.out.println(p.getProperty("language"));
		p.store(i, "Added on 22/03/2022");
	}

}
