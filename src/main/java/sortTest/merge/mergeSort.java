package sortTest.merge;

import initDate.sortArraysDate;
import sortTest.util.sortUtil;

/**
 * Created by ytG on 2017/6/10.
 */
public class mergeSort {


    private  int [] sortArrays  ;

/*    基本排序：归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有
    序表，即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并
    为整体有序序列。*/

    public  mergeSort(){

        this.sortArrays = sortArraysDate.getSortArraysDate();
    }

    public void sort(){

        mergesort(sortArrays, 0, sortArrays.length - 1);

        sortUtil.displayArrays(sortArrays);
    }

    private void mergesort(int[] data, int left, int right) {

        if (left >= right)
            return;
        // 找出中间索引
        int center = (left + right) / 2;
        // 对左边数组进行递归
        mergesort( data, left, center);
        // 对右边数组进行递归
        mergesort( data, center + 1, right);
        // 合并
        merge( data, left, center, right);
    }

    /**
     * 将两个数组进行归并，归并前面2个数组已有序，归并后依然有序
     *
     * @param data
     *            数组对象
     * @param left
     *            左数组的第一个元素的索引
     * @param center
     *            左数组的最后一个元素的索引，center+1是右数组第一个元素的索引
     * @param right
     *            右数组最后一个元素的索引
     */
    public static void merge(int[] data, int left, int center, int right) {
        // 临时数组
        int[] tmpArr = new int[data.length];

        // 右数组第一个元素索引
        int mid = center + 1;

        // third 记录临时数组的索引
        int third = left;

        // 缓存左数组第一个元素的索引
        int tmp = left;

        while (left <= center && mid <= right) {
            // 从两个数组中取出最小的放入临时数组
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }

        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[left++];
        }
        // 将临时数组中的内容拷贝回原数组中
        // （原left-right范围的内容被复制回原数组）
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
    }
}
