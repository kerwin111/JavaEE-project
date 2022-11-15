package Chapter6;


//递归
public class recursion01 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.test(4);
    }
}
class Test{
    public void test(int n){
        if (n>2){
            test(n-1);
        }
        System.out.println("n="+n);
    }
}
