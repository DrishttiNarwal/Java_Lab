package assignment2_part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoArrayList {

    public List<Integer> convertArrayToArrayList(int[] array) {
    	System.out.println("\nOriginal Array: " + Arrays.toString(array));
        List<Integer> arrayList = new ArrayList<>();
        
        for (int value : array) {
            arrayList.add(value);
        }
        
        return arrayList;
    }

}