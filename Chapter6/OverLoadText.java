package Chapter6;


public class OverLoadText {
    public static void main(String[] args) {
        M m = new M();
        m.m1(2);
        m.m1(2,3);
        m.m1("哈哈哈");

    }
}

class M{
    public int m1 (int num1){
        int num = num1 * num1;
        System.out.println(num);
        return num;
    }
    public int m1(int num1,int num2){
        int num = num1 * num2;
        System.out.println(num);
        return num;
    }
    public String m1(String num1){
        System.out.println(num1);
        return num1;
    }

}


