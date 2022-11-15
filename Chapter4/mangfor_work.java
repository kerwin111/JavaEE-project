package Chapter4;

import java.util.Scanner;

public class mangfor_work {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int totalScore = 0;
        for (int i = 1;i<=3;i++){
            int score = 0;
            for (int j =1;j<=5;j++){
                System.out.println("请输入第"+i+"个班,第"+j+"个人的成绩");
                int num = myScanner.nextInt();
                score += num;
            }
            System.out.println("总分为:"+score+"平均分为"+ (score/5) );
            totalScore += score;
        }
        System.out.println("全年级的总分为:"+totalScore+"全年级平均分为"+(totalScore/15) );
    }
}
