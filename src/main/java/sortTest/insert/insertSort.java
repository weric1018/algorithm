package sortTest.insert;

import  initDate.sortArraysDate;
import sortTest.util.sortUtil;

/**
 * Created by ytG on 2017/6/8.
 */
public class insertSort {

    private  int [] sortArrays  ;

    public  insertSort(){

        this.sortArrays = sortArraysDate.getSortArraysDate();
    }

    /**
     * 直接插入排序:在要排序的一组数中，假设前面(n-1)[n>=2] 个数已经是排
     好顺序的，现在要把第n 个数插到前面的有序数中，使得这 n个数
     也是排好顺序的。如此反复循环，直到全部排好顺序。
     */
    public  void sort(  ){

      int temp = 0;

      for (int i = 1; i < sortArrays.length ; i++){
               temp = sortArrays[i] ;
          int k = i-1 ;

          for(; k>=0 && sortArrays[k]>temp ; k --){
                sortArrays[k+1]= sortArrays[k];
               }
          sortArrays[k+1] =temp;


      }

        sortUtil.displayArrays(sortArrays);


    }
}
