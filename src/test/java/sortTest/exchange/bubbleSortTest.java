package sortTest.exchange;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by ytG on 2017/6/10.
 */
public class bubbleSortTest {

    bubbleSort sort ;

    @Before
    public void setUp() throws Exception {

        sort = new bubbleSort();
    }

    @Test
    public void sort() throws Exception {

        sort.sort();
    }

}