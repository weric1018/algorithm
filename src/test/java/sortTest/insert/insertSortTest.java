package sortTest.insert;

import org.junit.Before;
import org.junit.Test;
import  sortTest.insert.insertSort;

import static org.junit.Assert.*;

/**
 * Created by ytG on 2017/6/8.
 */
public class insertSortTest {

    insertSort sort ;
    @Before
    public void setUp() throws Exception {

        sort = new insertSort();
    }

    @Test
    public void sort() throws Exception {

          sort.sort();
    }

}