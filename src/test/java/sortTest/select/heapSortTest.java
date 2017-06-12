package sortTest.select;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by ytG on 2017/6/10.
 */
public class heapSortTest {

    heapSort sort ;
    @Before
    public void setUp() throws Exception {
        sort = new heapSort();

    }

    @Test
    public void sort() throws Exception {

        sort.sort();
    }

}