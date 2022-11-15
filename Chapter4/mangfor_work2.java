package Chapter4;

import java.util.Scanner;

public class mangfor_work2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int age= 0;
        for (int i = 1;i<=3;i++){
            for (int j =1;j<=5;j++){
                System.out.println("请输入第"+i+"个班,第"+j+"个人的成绩");
                int num = myScanner.nextInt();
                if (num>=60){
                    age++;
                }
            }
        }
        System.out.println("三个班及格人数为:"+age);
    }
}
