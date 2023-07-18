package org.example;

public class Bai3_1 {
    public static void main(String[] args) {
        int A[] = {1,23,4,5,6,78,8,2,32,2,32,432,32,234,432,1,248,15618};
            int len= A.length;

            int A2[] = new int[len];
            int j = 0;

            for (int i =len-1 ; i >= 0; i--){
                A2[j] = A[i];
                j++;
            }
            for (int i=0; i< len; i++){
                A[i]= A2[i];
            }
            for (int i= 0; i < len; i++)
            {
                System.out.println(A[i]);
            }

        }
    }
