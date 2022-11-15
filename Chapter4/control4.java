package Chapter4;

import java.util.Scanner;

public class control4 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = myScanner.nextInt();
        if (num%4==0&num%100!=0){
            System.out.println("平闰年");
        }else if(num%400==0){
            System.out.println("世纪闰年");
        }else {
            System.out.println("平年");
        }
    }
}
