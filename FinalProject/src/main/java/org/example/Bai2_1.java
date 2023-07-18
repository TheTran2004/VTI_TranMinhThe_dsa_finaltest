package org.example;

public class Bai2_1 {
    public static void main(String[] args) {
        int n = 123432;

        // Viết hàm kiểm tra n có phải là số đối xứng không ?
        boolean check= checkOx(String.valueOf(n));
        System.out.println(checkOx(String.valueOf(n)));
    }
    static boolean checkOx(String s){
        int j = s.length()-1;
        for (int i=0;i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
