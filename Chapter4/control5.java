package Chapter4;

import java.util.Scanner;

public class control5 {
    public static void main(String[] args){
        int count =0;
        for (int i =1;i<=100;i++){
            if (i%5!=0){
                count++;
                System.out.print(i +"\t");
                if (count%5==0){
                    System.out.println();
                }
            }
        }
    }
}
