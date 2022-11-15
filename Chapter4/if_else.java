package Chapter4;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入月份:");
        int mouth = myScanner.nextInt();
        if (mouth >= 4 & mouth<=10 ){
            System.out.println("请输入年龄");
            int age1 = myScanner.nextInt();
            if (age1 >= 18 & age1 <= 60 ) {
                System.out.println("旺季成人票要60元");
            } else if (age1 < 18) {
                System.out.println("旺季儿童票只要半价");
            } else {
                System.out.println("旺季老人票只要三分之一");
            }
        } else {
            System.out.println("请输入年龄:");
            int age2 = myScanner.nextInt();
            if (age2 >= 18 & age2 <= 60) {
                System.out.println("淡季季成人票要40元");
            } else {
                System.out.println("淡季其他票只要20元");
            }
        }
    }
}
