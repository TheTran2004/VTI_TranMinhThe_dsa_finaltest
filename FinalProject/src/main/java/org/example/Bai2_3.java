package org.example;

import java.util.Stack;

public class Bai2_3 {
    public static void main(String[] args) {

        int n = 123432;
        Stack<Integer> binaryStack = new Stack<Integer>();

        while (n > 0) {
            int remainder = n % 2;
            binaryStack.push(remainder);
            n /= 2;
        }

        StringBuilder binaryString = new StringBuilder();
        while (!binaryStack.isEmpty()) {
            binaryString.append(binaryStack.pop());
        }

        System.out.println("Số nhị phân của n là " + n + binaryString.toString());
    }
}
