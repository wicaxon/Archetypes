package ${package};

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * A com.blangkon Class
 */
public class App {

	private static final Logger log = LogManager.getLogger(App.class.getName());

    public static void main( String[] args )
    {
    	log.debug( "Hello blangkon !" );
    }
}
