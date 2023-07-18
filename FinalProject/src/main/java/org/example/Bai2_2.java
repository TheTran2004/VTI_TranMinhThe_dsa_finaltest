package org.example;

public class Bai2_2 {
    public static void main(String[] args) {
        int n = 123432;
        String result[] = getArray(String.valueOf(n));
        for (String s: result){
            System.out.println(s+ " ");
        }
    }
    public static String[] getArray(String temp) {
        int count = 0;
        String tempNew = "";
        String result[] = new String[temp.length()/ 1];
        for (int i = 0; i < temp.length(); i++) {
            if ( i > 0) {
                tempNew += " " + temp.charAt(i) ;
            } else {
                tempNew += temp.charAt(i) + "";
            }

        }
        result = tempNew.split(" ");
        for (int i = 0; i < result.length; i++) {
            if (result[i].length() == 1) {
                result[i] = " " + result[i];
            }
        }
        return result;
    }
}
