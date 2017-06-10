package sortTest.insert;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by ytG on 2017/6/9.
 */
public class shellSortTest {

    shellSort sort ;
    @Before
    public void setUp() throws Exception {

        sort = new shellSort();
    }

    @Test
    public void shellSort() throws Exception {

        sort.sort();
    }

}