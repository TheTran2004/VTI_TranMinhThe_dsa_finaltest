package org.example;

import java.util.Arrays;

public class Bai4_1 {
    public static void main(String[] args) {
       int A[] = {100,2130,123,3,54,6,1,2,11,2,1,1,1,1,45,5,465,46,1234,54353};
        int[] B = new int[A.length];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[index++] = A[i];
            }
        }
        Arrays.sort(B, 0, index);
        index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                A[i] = B[index++];
            }
        }
        System.out.println(Arrays.toString(A));

    }
}
