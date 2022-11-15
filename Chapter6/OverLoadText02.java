package Chapter6;


public class OverLoadText02 {
    public static void main(String[] args) {
        ma ma = new ma();
        int ma1 =ma.max(2,3);
        System.out.println("两个int值中"+ma1+"最大");
        double ma2 = ma.max(2.5,3.1);
        System.out.println("两个double值中"+ma2+"最大");
        double ma3 = ma.max(2.5,3.1,5.0);
        System.out.println("两个double值中"+ma3+"最大");

    }
}

class ma{
    public int max(int num1,int num2){
        int max = 0;
        max = num1;
        if (num1<num2){
            max = num2;
        }
        return max;
    }
    public double max(double num1,double num2){
        double max = 0;
        max = num1;
        if (num1<num2){
            max = num2;
        }
        return max;
    }
    public double max(double num1,double num2,double num3){
        double max = 0;
        max = num1;
        if (num1<num2 && num3 < num2){
            max = num2;
        }else if (num3 >num1 && num3 >num2){
            max = num3;
        }
        return max;
    }



}


