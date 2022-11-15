package Chapter4;

import java.util.Scanner;

public class control3 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = myScanner.nextInt();
        if (num>0){
            System.out.println("大于0");
        }else if (num<0){
            System.out.println("小于0");
        }else {
            System.out.println("等于0");
        }
    }
}
