package Chapter4;

public class control {
    public static void main(String[] args){
        int money = 100000;
        int num = 0;
        while (money>50000){
            money -=(money*0.05);
            num++;
        }
        System.out.println("可以经过的次数:"+num);
    }
}
