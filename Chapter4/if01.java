package Chapter4;

import java.util.Scanner;

public class if01 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你的成绩:");
        double score = myScanner.nextDouble();
        if (score > 8.0 ){
            System.out.println("请输入性别:");
            char gender = myScanner.next().charAt(0);
            if (gender == '男'){
                System.out.println("恭喜你,你进入男子组");
            }else if (gender == '女'){
                System.out.println("恭喜你,你进入女子组");
            }else
                System.out.println("请输入正确的性别");
        }else {
            System.out.println("sorry, 你被淘汰了");
        }
    }

}