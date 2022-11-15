package Chapter4;

import java.util.Scanner;

public class Switch_work {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入:");
        char num1 = myScanner.next().charAt(0);
        switch (num1) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            case 'f':
                System.out.println("F");
                break;
            default:
                System.out.println("other");
        }
        System.out.println("执行结束");
    }
}
