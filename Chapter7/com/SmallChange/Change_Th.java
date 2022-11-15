package Chapter7.com.SmallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Change_Th {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        String detail = "\n-----------零钱通明细-----------";

        double money = 0; //金额
        double balance = 0; //余额

        Date date = null;
        String note = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        do {
            System.out.println("==========零钱通==========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");

            System.out.println("请选择1-4:");
            key = scanner.next();

            switch (key){
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.println("零钱通收益入账");
                    date = new Date();
                    money = scanner.nextDouble();
                    if (money <= 0){
                        System.out.println("请输入正确的金额");
                        break;
                    }
                    balance += money;
                    detail += "\n收益入账:+"+money +"\t"+ sdf.format(date)+"\t"+ "余额为:"+balance;
                    break;
                case "3":
                    System.out.println("消费明细");
                    money = scanner.nextDouble();
                    if (money <=0 || money >balance){
                        System.out.println("请输入 0-99的金额");
                        break;
                    }
                    balance -= money;
                    System.out.println("消费说明");
                    note = scanner.next();
                    detail += "\n消费明细:-"+money +"\t"+"消费说明:"+note+"\t"+ sdf.format(date)+"\t"+ "余额为:"+balance;
                    break;
                case "4":
                    String choice = "";
                    while (true){
                        System.out.println("请问是否要退出y/n:");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)){
                            break;
                        }
                    }
                    if (choice.equals("y")){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误,请重新选择");
            }
        }while (loop);
        System.out.println("=====退出了零钱通=====");
    }
}
