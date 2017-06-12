package sortTest.merge;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by ytG on 2017/6/11.
 */
public class mergeSortTest {

    mergeSort sort ;
    @Before
    public void setUp() throws Exception {

        sort = new mergeSort();
    }

    @Test
    public void sort() throws Exception {

        sort.sort();
    }

}