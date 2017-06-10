package sortTest.select;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by ytG on 2017/6/9.
 */
public class simpleSelectSortTest {

    simpleSelectSort sort ;

    @Before
    public void setUp() throws Exception {

        sort = new simpleSelectSort();
    }

    @Test
    public void sort() throws Exception {

        sort.sort();
    }

}