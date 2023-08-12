package CSE;

import java.util.Arrays;

class CheckClass {
    public static int checkValue (String s1, String s2) {
        return s1.length() - s2.length();
    }
}

class CheckClassMain {
    public static void main(String[] args) {
        String[] strArray = new String [] {"Tiger", "Rat", "Cat", "Lion"};
        Arrays.sort(strArray, CheckClass :: checkValue);//line n1
        for (String s : strArray) {
        System.out.print (s + " ");
        }
    }
}

