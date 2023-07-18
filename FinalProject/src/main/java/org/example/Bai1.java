package org.example;

public class Bai1 {
    public static void main(String[] args) {

        String s = "Abcs12321421@$$%#@#@#$%#$$$#@#@";
        s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
    static boolean isNomal(char c){

        if (Character.isDigit(c) || Character.isLetter(c)){
            return true;
        }
        return false;

    }
}
