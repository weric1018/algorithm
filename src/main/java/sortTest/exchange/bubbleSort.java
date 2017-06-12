package sortTest.exchange;

import initDate.sortArraysDate;
import sortTest.util.sortUtil;

/**
 * Created by ytG on 2017/6/10.
 */
public class bubbleSort {

    private  int [] sortArrays  ;

    public  bubbleSort(){

        this.sortArrays = sortArraysDate.getSortArraysDate();
    }

    /**
     * 冒泡排序 :在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对

     相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。即：每当两相邻的

     数比较后发现它们的排序与排序要求相反时，就将它们互换。
     */
    public void sort(){

        int  temp = 0 ;

       //控制循环次数，N个数排序，最多循环N-1次
       for(int i = sortArrays.length-1 ; i >0 ; i -- ){

            //控制交互比较次数，每次 N-i 个数 i是已拍好顺序的个数
           for(int k = 0 ; k <i ; k ++){

               if(sortArrays[k]>sortArrays[k+1]){
                  temp = sortArrays[k] ;
                   sortArrays[k] = sortArrays[k+1];
                   sortArrays[k+1] = temp ;
               }
           }
       }

        sortUtil.displayArrays(sortArrays);

    }

}
