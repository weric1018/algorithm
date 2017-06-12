package utilTool.logger;

/**
 * Created by ytG on 2017/6/9.
 */
public class log {

    public static  void info(String msg){
       //todo   2017-6-9 wl -> if have times alert method us log4J
        System.out.print(msg);

    }

    public static  void info(int msg){

        info(msg+"");

    }

}
