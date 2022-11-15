package Chapter5;

import java.util.Scanner;

//数组扩容
public class ArrayAdd2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1,2,3};
        do {
            int[] arr2 = new int[arr.length + 1];
            for (int i=0;i< arr.length;i++){
                arr2[i] = arr[i];
            }
            System.out.println("请输入数字:");
            int addNum = myScanner.nextInt();
            arr2[arr2.length-1] = addNum;
            arr = arr2;
            for (int i=0;i< arr.length;i++){
                System.out.print(arr[i]+"\t");
            }
            System.out.println("请问还要继续输入吗:y/n");
            char answer = myScanner.next().charAt(0);
            if (answer == 'n'){
                break;
            }
        }while (true);
            System.out.println("结束运行");
    }
}
