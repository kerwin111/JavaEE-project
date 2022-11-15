package TeacherHomeWork;

import java.util.Scanner;

public class extend_work {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的语文成绩:");
        int chi_score = scanner.nextInt();

        System.out.print("请输入你的数学成绩:");
        int ma_score = scanner.nextInt();

        System.out.print("请输入你的英语成绩:");
        int eng_score = scanner.nextInt();

        new Imp_university(chi_score,ma_score,eng_score);
        new Ord_university(chi_score,ma_score,eng_score);


    }

}
