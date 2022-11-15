package Chapter4;

//水仙花数
public class control9 {
    public static void main(String[] args){
        int sum = 0;
        for (int i=0;i<=100;i++){
            for (int j=0;j<=i;j++){
                sum+=j;
            }
        }
        System.out.println(sum);
    }
}
