package Chapter5;

import java.util.Scanner;

//数组扩容
public class ArrayReduce {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};

        do{
            int[] arr2 = new int[arr.length - 1];
            for (int i=0;i < arr.length-1;i++){
                arr2[i] = arr[i];

            }
            arr = arr2;
            for (int i=0;i< arr.length;i++){
                System.out.println(arr[i]);
            }
            if (arr.length == 1){
                System.out.println("不能再缩减了");
                break;
            }
            System.out.println("请问还要继续删减吗:y/n");
            char answer = myScanner.next().charAt(0);
            if (answer == 'n'){
                break;
            }
        }while (true);
            System.out.println("结束运行");
    }
}
