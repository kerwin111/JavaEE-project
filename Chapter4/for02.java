package Chapter4;

public class for02 {
    public static void main(String[] args){
        int num1 = 1;
        int num2 = 100;
        int sum = 0;
        int count = 0;
        int bei = 5;
        for(int i =num1; i<=num2;i++){
            if(i%bei==0){
                System.out.println("i="+i);
                count++;
                sum+=i;
            }
        }
        System.out.println("个数为:"+count);
        System.out.println("总数为:"+sum);
    }
}
