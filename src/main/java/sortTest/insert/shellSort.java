package sortTest.insert;

import initDate.sortArraysDate;
import sortTest.util.sortUtil;

/**
 * Created by ytG on 2017/6/9.
 */
public class shellSort {

    private  int [] sortArrays  ;

    public  shellSort(){

        this.sortArrays = sortArraysDate.getSortArraysDate();
    }

    /**
     * 希尔排序（最小增量排序）:算法先将要排序的一组数按某个增量 d（n/2,n为要排序数的个数）分成若
     干组，每组中记录的下标相差 d.对每组中全部元素进行直接插入排序，然后再用一个较小
     的增量（d/2）对它进行分组，在每组中再进行直接插入排序。当增量减到 1 时，进行直接
     插入排序后，排序完成。
     */
    public void sort(){
    //计算步长用Math.ceil()，需要用double，用int做/2动作会丢失精度,具体参考g的输出
     double d1=sortArrays.length;

     int temp  = 0 ;

    // int g = sortArrays.length;

   //  g = g%2==0?g/2:g/2+1;

    while (true){

    //    log.info(g+"---------"+"\n\r");

         d1 =Math.ceil(d1/2) ;

        //步长
        int d = (int)d1;

        //控制组
        for (int x = 0 ; x < d ; x++){

            //insertSort (增量变成步长值)

            for (int i = x+d; i < sortArrays.length; i++ ){

                temp = sortArrays[i];

                int j = i-d;

                for(;j>=0 && sortArrays[j]>temp;j-=d){

                sortArrays[j+d]= sortArrays[j];
                }

                sortArrays[j+d]=temp;

            }
        }
        //g = (int)Math.ceil(g/2);
      //  g = g%2==0?g/2:g/2+1;
      //  log.info("---------"+d+"\n\r");

        if(d==1){
            break;
        }
    }

        sortUtil.displayArrays(sortArrays);
    }
}
