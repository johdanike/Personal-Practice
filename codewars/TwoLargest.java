package codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoLargest {
    public static void main(String[] args) {
        System.out.println(twoLargest(new int[]{3, 4, 5, 6, 8}));
    }


    public static ArrayList<Integer> twoLargest(int []array){
        ArrayList<Integer> newArray=new ArrayList<>();
        for(int index = 0; index < array.length; index++){
            for(int loop = index+1; loop < array.length; loop++){
                if(array[index] > array[loop]){
                    array[loop] ^= array[index];
                    array[index] ^= array[loop];
                    array[loop] ^= array[index];
                }
            }
        }
        System.out.println(Arrays.toString(array));
        for(int index = array.length-1; index > 2; index--){
            newArray.add(array[index]);
        }
        return newArray;
    }


}
