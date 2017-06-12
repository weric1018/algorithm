package initDate;

/**
 * Created by ytG on 2017/6/9.
 */
public class sortArraysDate {


    private static int [] sortArrays ={ 49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23, 34,15,35,25,53,51 };

    public static  int[] getSortArraysDate(){


        int startFromIndex = 0;
        int startToIndex = 0;
        int copeLength =sortArrays.length;


        int[] resultArray = new int[sortArrays.length] ;
       //Todo  2017-6-9 wl  -> use Arrays.copeof has some problem
        System.arraycopy(sortArrays, startFromIndex, resultArray, startToIndex, copeLength);


        return resultArray;
    }




}
