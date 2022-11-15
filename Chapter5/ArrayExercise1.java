package Chapter5;

import java.util.Scanner;

public class ArrayExercise1 {

    public static void main(String[] args) {
//        char eng[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//        for (int i =0;i<eng.length;i++){
//            System.out.println("第"+(i+1)+"个元素的值为"+eng[i]);
//        }
        char chars[] = new char[26];
        for (int i=0;i<chars.length;i++){
            chars[i] =(char)('A'+i);
        }
        for (int i=0;i< chars.length;i++){
            System.out.println(chars[i]);
        }
    }
}
