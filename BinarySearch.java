// 2. Using Binary Search Method: 

import java.util.Arrays;

public class BinarySearch {
    
    private static int check(int[] arr, int value){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

       while(start <= end){
        if(arr[mid] < value){
            start = mid + 1;
        }else if(arr[mid] > value){
            end = mid -1;
        }else{
            return mid;
        }
       }
       return -1;
    }

    public static void main(String[] args){
        int[] arr = {23, 56, 89, 3, 4, 22, 88, 56};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int value = 56;
        int ans = check(arr, value);

        if(ans == -1){
            System.out.println("Value not found in the array");
        }else{
            System.out.println("Value found at index: " + ans);
        }
    }
}
