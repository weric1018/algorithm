package sortTest.radix;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by ytG on 2017/6/11.
 */
public class radixSortTest {

    radixSort sort ;
    @Before
    public void setUp() throws Exception {

        sort = new radixSort();
    }

    @Test
    public void sort() throws Exception {

        sort.sort();
    }

}