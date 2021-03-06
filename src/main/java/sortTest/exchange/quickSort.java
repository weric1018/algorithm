package sortTest.exchange;

import initDate.sortArraysDate;
import sortTest.util.sortUtil;

/**
 * Created by ytG on 2017/6/10.
 */
public class quickSort {

    private  int [] sortArrays  ;

    public  quickSort(){

        this.sortArrays = sortArraysDate.getSortArraysDate();
    }

    /**
     * 快速排序 :选择一个基准元素,通常选择第一个元素或者最后一个元素,通过一趟扫描，

     将待排序列分成两部分,一部分比基准元素小,一部分大于等于基准元素,此时基准元素在其

     排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。
     */
    public void sort(){

        quick(sortArrays);
        sortUtil.displayArrays(sortArrays);
    }

    public int getMiddle(int[] list, int low, int high) {
        int tmp =list[low];    //数组的第一个作为中轴

        while (low < high){
              while (low < high&& list[high] >= tmp) {
                    high--;
                }

             list[low] =list[high];   //比中轴小的记录移到低端

             while (low < high&& list[low] <= tmp) {
                    low++;
              }

              list[high] =list[low];   //比中轴大的记录移到高端
        }
        list[low] = tmp;              //中轴记录到尾
        return low;                   //返回中轴的位置
    }

    public void _quickSort(int[] list, int low, int high) {
        if (low < high){
            int middle =getMiddle(list, low, high);  //将list 数组进行一分为二
            _quickSort(list, low, middle - 1);       //对低字表进行递归排
            _quickSort(list,middle + 1, high);       //对高字表进行递归排
        }
    }



    public void quick(int[] a2) {
        if (a2.length > 0) {    //查看数组是否为空
            _quickSort(a2, 0, a2.length - 1);
        }
    }
}
