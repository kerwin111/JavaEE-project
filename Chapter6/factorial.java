package Chapter6;


public class factorial {
    public static void main(String[] args) {
        T t1 = new T();
        int f1 = t1.factorial(5);
        System.out.println("5的阶乘等于:"+f1);
    }
}
class T{
    public int factorial (int num){
        if (num==1){
            return 1;
        }else {
            return factorial(num-1) * num;
        }
    }
}
