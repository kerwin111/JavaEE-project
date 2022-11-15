package Chapter5;

import java.util.Random;

//冒泡排序
public class ArrayHomeWork3 {
    public static void main(String[] args) {
        int[] arr = {36,21,20,48,12,50,11,60,9};
        int temp = 0;

        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
            System.out.println("\n"+"第"+i+"次排序");
            for (int j=0;j< arr.length;j++){
                System.out.print(arr[j]+"\t");
            }
        }

    }
}
