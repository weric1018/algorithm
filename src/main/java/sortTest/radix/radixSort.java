package sortTest.radix;

import initDate.httpCode;
import initDate.sortArraysDate;
import sortTest.util.sortUtil;

/**
 * Created by ytG on 2017/6/10.
 */
public class radixSort {


    private  int [] sortArrays  ;

    public  radixSort(){

        this.sortArrays = sortArraysDate.getSortArraysDate();
    }
    //TODO   NEED ADD  METHOD


    /*基数排序：将所有待比较数值（正整数）统一为同样的数位长度，数位较短的数前面
    补零。然后，从最低位开始，依次进行一次排序。这样从最低位排序一直到最高位排序完成
    以后,数列就变成一个有序序列。*/
    public void sort(){

      //首先确定趟数

        int max = sortArrays[0];

        for(int i = 1 ; i< sortArrays.length; i++){

            if(max < sortArrays[i]){
                max = sortArrays[i];
            }
        }

         int times = 0 ;

        while (max >0){

            max/=10 ;
            times++;
        }

        radixSort(sortArrays,times*100);


        sortUtil.displayArrays(sortArrays);
    }


    private static void radixSort(int[] array,int d)
    {
        int n=1;//代表位数对应的数：1,10,100...
        int k=0;//保存每一位排序后的结果用于下一位的排序输入
        int length=array.length;
        int[][] bucket=new int[10][length];//排序桶用于保存每次排序后的结果，这一位上排序结果相同的数字放在同一个桶里
        int[] order=new int[length];//用于保存每个桶里有多少个数字
        while(n<d)
        {
            for(int num:array) //将数组array里的每个数字放在相应的桶里
            {
                int digit=(num/n)%10;
                bucket[digit][order[digit]]=num;
                order[digit]++;
            }
            for(int i=0;i<length;i++)//将前一个循环生成的桶里的数据覆盖到原数组中用于保存这一位的排序结果
            {
                if(order[i]!=0)//这个桶里有数据，从上到下遍历这个桶并将数据保存到原数组中
                {
                    for(int j=0;j<order[i];j++)
                    {
                        array[k]=bucket[i][j];
                        k++;
                    }
                }
                order[i]=0;//将桶里计数器置0，用于下一次位排序
            }
            n*=10;
            k=0;//将k置0，用于下一轮保存位排序结果
        }

    }
}
