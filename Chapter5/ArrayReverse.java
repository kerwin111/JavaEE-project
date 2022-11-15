package Chapter5;

//数组反转
public class ArrayReverse {
    public static void main(String[] args) {

        int[] arr1 = {11,22,33,44,55,66};
        int temp = 0;
        int len = arr1.length;
        for (int i=0;i< len/2;i++){
            temp = arr1[len-1-i];
            arr1[len-1-i] = arr1[i];
            arr1[i] = temp;
        }
        System.out.println("反转之后的值");
        for (int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]+ "\t");
        }
    }
}
