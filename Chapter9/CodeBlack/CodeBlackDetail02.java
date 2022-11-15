package Chapter9.CodeBlack;

public class CodeBlackDetail02 {
    public static void main(String[] args) {
        new A();

    }
}

class A{
    public int n2 = getN2();
    {
        System.out.println("A 普通代码块1加载了");
    }
    static{
        System.out.println("A 静态代码块1加载了");
    }
    public static int n1 = getN1();

    public int getN2(){
        System.out.println("getN2()加载了");
        return 200;
    }

   public static int getN1(){
       System.out.println("getN1()加载了");
       return 100;
   }

   public A(){
       System.out.println("A()构造方法加载了");
   }
}


