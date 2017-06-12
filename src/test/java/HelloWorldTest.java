import static org.junit.Assert.*;

/**
 * Created by ytG on 2017/6/6.
 */
public class HelloWorldTest {

    HelloWorld hw;
    @org.junit.Before
    public void setUp() throws Exception {
        hw = new HelloWorld();

    }

    @org.junit.Test
    public void sayHello() throws Exception {


        hw.sayHello();

    }

}