package prueba;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	
	private static final Logger Logger = LogManager.getLogger(Test.class);
	
	public static void main(String[] args) {
		
		Logger.trace("Traza");
		Logger.debug("Debug");
		Logger.info("Info");
		Logger.warn("Warning");
		Logger.error("Error");
		Logger.fatal("Fatal");
		
		
		
	}
}
