package Chapter7.com.BigChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Change_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String detail = "========零钱通明细=======";
        String key = "";
        double money = 0;
        double balance = 0;
        String note = "";
        Date date = new Date();
        String exit = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");
        boolean loop = true;

        do {
            System.out.println("=======零钱通=======");
            System.out.println("1.零钱通明细");
            System.out.println("2.收入");
            System.out.println("3.消费");
            System.out.println("4.退出");

            System.out.println("请输入1-4:");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.println("收入:");
                    money = scanner.nextDouble();
                    if (money <=0){
                        System.out.println("请输入正确的金额");
                        break;
                    }
                    balance += money;
                    detail += "\n" +"收入"+ "+" + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
                    break;
                case "3":
                    System.out.println("消费:");
                    money = scanner.nextDouble();
                    if (money <=0 || money >balance){
                        System.out.println("请输入正确的金额");
                        break;
                    }
                    balance -= money;
                    System.out.println("消费说明");
                    note = scanner.next();
                    detail += "\n" +note+ "-" + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
                    break;

                case "4":
                    while (true) {
                        System.out.println("请问是否要退出y/n");
                        exit = scanner.next();
                        if ("y".equals(exit) || "n".equals(exit)) {
                            break;
                        }
                    }
                    if (exit.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("请输入正确的选项");
            }
        } while (loop);
        System.out.println("退出了零钱通");
    }
}
