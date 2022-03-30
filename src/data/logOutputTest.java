package data;

import org.apache.log4j.Logger;

public class logOutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Save log4j.jar into libraries from build path
		//Save log4j.properties files into src folder
		//modify the path of output file in log4j.properties file 
		//create Logger object and import org.apache.log4j
		//Logger.getLogger method to create obj
		//
		Logger log=Logger.getLogger("devpinoyLogger");//devpinoyLogger string comes from log4j.properties file
		
		
		log.debug("Hello");
		log.debug("Hi, this is logging the output");
	}

}
