package Chapter5;


public class ArrayHomeWork2 {
    public static void main(String[] args) {
            int[] arr = new int[10];
            for (int i=0;i< arr.length;i++){
                arr[i] = (int)(Math.random() *100) +1;
                System.out.print(arr[i]+"\t");
            }
        System.out.println("正序打印");
            for (int j= arr.length-1;j>=0;j--){
                System.out.print(arr[j]+"\t");
            }
        System.out.println("逆序打印");
    }
}
