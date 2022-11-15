package Chapter5;

public class ArrayExercise2 {

    public static void main(String[] args) {
        int[] arr = {4,-1,9,10,23,50};
        int max = 0;
        int maxindex = 0;

        for (int i=0;i< arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
                maxindex = i;
            }
        }
        System.out.println("最大值为:"+max+"最大值的下标为:"+maxindex);
    }
}
