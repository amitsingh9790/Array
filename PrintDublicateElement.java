package Array;

public class PrintDublicateElement {
    public static void main(String[] args) {
        int [] A = {4,3,5,6,8,10,11,12,2};
        int [] B = {2,3,4,7,9,10};
        int alength = A.length;
        int blength = B.length;
        for (int i = 0; i < alength; i++)
            for (int j = 0; j < blength ; j++) {
                if(A[i]==B[j])
                    System.out.print(A[i]+" ");
            }
    } 
}
