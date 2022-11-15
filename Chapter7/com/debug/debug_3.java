package Chapter7.com.debug;

public class debug_3 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum()+10); //40
//        System.out.println();
    }
}

class A{
    public int i = 10;

    public int sum(){
        return getI() + i;
    }

    public int sum1(){
        return i+10;
    }

    public int getI(){
        return i;
    }
}

class B extends A{
    public int i = 20;

//    public int sum(){
//        return i+20;
//    }

    public int sum1(){
        return i+10;
    }

    public int getI(){
        return i;
    }
}