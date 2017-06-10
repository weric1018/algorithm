package sortTest.select;

import initDate.sortArraysDate;
import sortTest.util.sortUtil;

/**
 * Created by ytG on 2017/6/9.
 */
public class simpleSelectSort {

    private  int [] sortArrays  ;

    public  simpleSelectSort(){

        this.sortArrays = sortArraysDate.getSortArraysDate();
    }


    /**
     * 简单选择排序: 在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
     然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一
     个数比较为止。
     */
  public void sort(){

     int position = 0 ;

     for(int i = 0 ; i < sortArrays.length; i++){

         int temp = sortArrays[i];

         for(int j =i+1 ; j < sortArrays.length; j++){
            if( sortArrays[j]< temp){
                 temp = sortArrays[j];
                 position =j ;
            }
         }
         sortArrays[position]=sortArrays[i];
         sortArrays[i]= temp;
     }

      sortUtil.displayArrays(sortArrays);

  }

}
