package Chapter4;

public class break_work {
    public static void main(String[] args){
        int sum = 0;
        int n = 0;
        for (int i = 0;i<=100;i++){
            sum += i;
            if (sum>20){
                n = i;
                break;
            }
        }
        System.out.println("当和大于20时,i为:"+n);

    }
}
