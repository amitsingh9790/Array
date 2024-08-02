package Array;

public class InsertionDeletionInArray {
    public static void main(String[] args) {
        int [] A = {4,2,6,7,9,1,2};
//        StaticKeyword.A=delete(StaticKeyword.A,0);
        A=insert(A,6,8);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
    }
    public static int[] delete(int[] arr, int index){
        if(arr == null || index<0 || index >= arr.length){
            System.out.println("Invalid Index");
            return arr;
        }

        int[] newArray = new int[arr.length-1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(index != i)
                newArray[j++] = arr[i];
        }
        return newArray;
    }
    public static int[] insert(int[] arr, int index,int value){
        if(arr == null || index<0 || index > arr.length)
            return arr;
        int[] newArray = new int[arr.length+1];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(index != i)
                newArray[j++] = arr[i];
            else
            {
                newArray[j++] = value;
                newArray[j++]=arr[i];
            }
        }
        return newArray;
    }
}