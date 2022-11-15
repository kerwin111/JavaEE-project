package Chapter4;

import java.util.Scanner;

public class Switch_work2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入0-100的数:");
        double num1 = myScanner.nextDouble();
        if (num1 >=0 & num1 <=100){
            switch ((int) (num1)/60){
                case 0:
                    System.out.println("不及格");
                    break;
                case 1:
                    System.out.println("及格");
                    break;
            }
        }else {
            System.out.println("输入无效");
        }

    }
}
