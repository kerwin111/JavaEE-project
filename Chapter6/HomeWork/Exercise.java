package Chapter6.HomeWork;

public class Exercise {
    public static void main(String[] args) {
        A01 a01 = new A01();
        double[] arr2 = {50,60,70,40,30};
        System.out.println(a01.max(arr2));


    }
}


class A01{
    public double max(double[] arr){
        double max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}