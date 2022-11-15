package Chapter4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入:");
        char num1 = myScanner.next().charAt(0);
        switch (num1) {
            case 'a':
                System.out.println("今天星期一,猴子穿新衣");
                break;
            case 'b':
                System.out.println("今天星期二,猴子当小二");
                break;
            case 'c':
                System.out.println("今天星期三,猴子爬雪山");
                break;
            default:
                System.out.println("请输入正确的字母");
        }
        System.out.println("你已退出该程序");
    }
}
