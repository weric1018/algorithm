package initDate;

/**
 * Created by ytG on 2017/6/11.
 */
public enum httpCode {

    OK(200),BADGATEWAY(500);

    // 定义私有变量
    private int nCode ;

    private httpCode(int code){

        this.nCode = code;
    }

    @Override
    public String toString() {
        return String.valueOf ( this . nCode );
    }


}
