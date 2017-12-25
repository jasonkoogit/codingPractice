import java.util.Arrays;

/**
 * Created by Jason Koo on 12/26/2017.
 *
 */
public class ReverseArray {
    public static int[] reverseArray (int[] arr){
        int[] newArr = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length-i-1];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(testArray)));
    }
}
