package Chapter4;

import java.util.Scanner;

public class break_work2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int chance = 0;
        for (int i = 1; i<=3;i++){
            System.out.println("请输入用户名:");
            String name = myScanner.next();
            System.out.println("请输入密码:");
            String psd = myScanner.next();
            if (name.equals("丁真") & psd.equals("666")){
                System.out.println("登录成功");
                break;
            }else {
                chance = (3-i);
                System.out.println("登录失败,还有"+chance+"次机会");
            }
        }
    }
}
