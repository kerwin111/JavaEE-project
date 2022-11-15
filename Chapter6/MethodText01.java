package Chapter6;


public class MethodText01 {
    public static void main(String[] args) {
        AA num = new AA();
//        boolean a = num.choose(10);
//        System.out.println("输入的值是单数odd嘛:"+a);
        if (num.choose(20)){
            System.out.println("是奇数");
        }else {
            System.out.println("是偶数");
        }

    }
}

class AA{
    public boolean choose(int num){
//        if (num%2==1){
//            return true;
//        }else {
//            return false;
//        }
        return num%2==1 ;
    }
}
