package Chapter4;

import java.util.Scanner;

public class if_else2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入数字:");
        int day = myScanner.nextInt();
        if (day<=5){
            System.out.println("今天工作日");
        }else if(day==6 | day==7) {
            System.out.println("今天休息日");
        }
        else {
            System.out.println("错误的星期数");
        }
    }
}
