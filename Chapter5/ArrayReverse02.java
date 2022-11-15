package Chapter5;

//数组反转
public class ArrayReverse02 {
    public static void main(String[] args) {

        int[] arr1 = {11,22,33,44,55,66};
        int len = arr1.length;
        for (int i= (len-1); i>=0;i--){
            System.out.print(arr1[i]+"\t");
        }
    }
}
