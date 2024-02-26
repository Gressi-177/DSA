package Array;

public class MoveZeroesEnd {
    // 1. Brute force approach using extra space and two single loops
    public static int[] moveZeroesEnd_01(int [] arr, int n) {
        int [] output = new int[n];
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                output[j++] = arr[i];
            }
        }
        while(j < n){
            output[j++] = 0;
        }

        return output;
    }
    // 2. Two pointers in-place solution using two single loops
    public static int[] moveZeroesEnd_02(int []arr, int n){
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
        }

        while (j < n){
            arr[j++] = 0;
        }

        return arr;
    }

    // 3. Two pointers in-place solution using a single loop
    public static int[] moveZeroesEnd_03(int[] arr, int n){
        int j = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                if(i != j){
                    arr[j] = arr[i];
                    arr[i] = 0;
                }
                j++;
            }
        }
        return arr;
    }
}

