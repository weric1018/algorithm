package utilTool.logger;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Created by ytG on 2017/6/9.
 */
public class log4J {


    public static void main(String[] args) {

        PropertyConfigurator.configure( "E:\\idealSpace\\stdTest\\src\\main\\resources\\log4j.properties" );
        Logger logger  =  Logger.getLogger(log4J. class );
        logger.debug( " debug " );
        logger.error( " error " );
    }


}
