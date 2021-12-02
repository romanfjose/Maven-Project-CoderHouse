import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mensaje {
    final Logger logger = LogManager.getLogger(Mensaje.class);

    public void getLogError(String parameter) {
        logger.error("Error: " + parameter);

    }
    public void getLogFata(String parameter) {

        logger.fatal("Fatal: " + parameter);
    }
}
