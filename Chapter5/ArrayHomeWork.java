package Chapter5;

import java.util.Scanner;

//数组反转
public class ArrayHomeWork {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] arr1 = {10,12,45,90};
        int[] arr2 = new int[arr1.length+1];
        for (int i=0;i< arr2.length;i++){
            arr2[i] = arr1[i];
        System.out.println("请输入要插入的数字:");
        int num = myScanner.nextInt();
        arr2[arr2.length-1] = num;
        for (int j=0;j< arr2.length;j++){
            System.out.println(arr2[j]);
        }
        }
    }
}
