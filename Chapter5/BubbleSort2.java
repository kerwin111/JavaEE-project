package Chapter5;

//冒泡排序
public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr={36,21,20,48,12,50,11,60,9};
        int temp = 0;

        for (int i=0;i<= arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
            System.out.println("\n"+"第"+(i+1)+"次排序");
            for (int j=0;j< arr.length;j++){
                System.out.print(arr[j]+"\t");
            }
        }
    }
}
