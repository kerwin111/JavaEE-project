package Chapter5;

public class Array1 {
    public static void main(String[] args) {
        double totalWeight = 0;
        double[] hens = {3,5,6,8,10,30,60,60,70};
        for (int i=0;i < hens.length;i++){
            totalWeight += hens[i];
        }
        System.out.println("总重量="+totalWeight+
                "平均重量="+ (totalWeight/hens.length));
    }
}
