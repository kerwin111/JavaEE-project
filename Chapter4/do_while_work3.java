package Chapter4;

import java.util.Scanner;

public class do_while_work3 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("闪电五连鞭");
            System.out.println("还不还钱:y/n");
            answer = myScanner.next().charAt(0);
            System.out.println("他的回答是"+answer);
        }while (answer != 'y');
    }
}
