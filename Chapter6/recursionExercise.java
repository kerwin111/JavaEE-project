package Chapter6;


//斐波那契数
public class recursionExercise {
    public static void main(String[] args) {
        D d1 = new D();
        int n = 7;
        int n2 =d1.fibonacci(n);
        if (n2 != -1){
            System.out.println("当n等于:"+n+"对应的斐波那契数为:"+n2 );
        }
    }
}

class D{
    public int fibonacci(int n){
        if (n>=0) {
            if (n == 1 | n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
        System.out.println("请输入大于-1的数字");
        return -1;
    }
}
