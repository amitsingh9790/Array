package Array;

public class OddEvenArray {
    public static void main(String[] args) {
        int[] arr = {5,6,3,2,8,1,5,7,9,11,10};
        int[] oddArray = new int[oddNo(arr)];
        int[] evenArray = new int[arr.length-oddNo(arr)];
        int oddIndex=0,evenIndex=0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if(arr[i]%2==0){
                evenArray[evenIndex] = arr[i];
                ++evenIndex;
            }
            else{ 
                oddArray[oddIndex] = arr[i];
                ++oddIndex;
            }
        }

        System.out.print("OddArray: ");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i]+" ");
        }
        System.out.print("\nEvenArray: ");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i]+" ");
        }
    }
    public static int oddNo(int[] arr){
        int odd = 0,n=arr.length;
        for (int i = 0; i < n; ++i) {
            if(arr[i]%2 != 0)
                ++odd;
        }
        return odd;
    }
}
