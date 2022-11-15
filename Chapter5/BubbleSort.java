package Chapter5;

//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {55,43,81,97,21};
        int temp = 0;
        for(int i=0;i<4;i++){
            for (int j=0;j<4-i;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("\n"+"第"+(i+1)+"轮排序");
            for (int j=0;j< arr.length;j++){
                System.out.print(arr[j]+"\t");
            }
        }

    }
}
