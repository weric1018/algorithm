package sortTest.exchange;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by ytG on 2017/6/10.
 */
public class quickSortTest {

    quickSort sort ;
    @Before
    public void setUp() throws Exception {

        sort = new quickSort();
    }

    @Test
    public void sort() throws Exception {

        sort.sort();
    }

}