package org.example;

public class Bai3_2 {
    public static void main(String[] args) {
        int A[] = {1,23,4,5,6,78,8,2,32,2,33,43,32,25,13,1,248,157};
        int left = 0;
        int right = A.length-1;

        while (left<right){
            while (A[left]%2 !=0){
                left ++;
            }
            while (A[right]%2 !=0){
                right --;
            }
            int temp = A[left];
            A[left] = A[right];
            A[right]= temp;
            left++;
            right--;
        }
        for (int x=0;x<A.length;x++)
        {
            System.out.println(A[x]+" ");
        }
    }
}
