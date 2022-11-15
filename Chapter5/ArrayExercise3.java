package Chapter5;

public class ArrayExercise3 {

    public static void main(String[] args) {
        double totalWeight = 0;
        double[] hens = {3,5,6,8,10,30,60,60,70};
        for (int i=0;i<hens.length;i++){
            totalWeight +=hens[i];
        }
        System.out.println("鸡的重量为:"+totalWeight+"平均数为:"+totalWeight/ hens.length);
    }
}
