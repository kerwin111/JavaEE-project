package Chapter9.CodeBlack;

public class CodeBlackDetail01 {
    public static void main(String[] args) {
//        C c = new C();
//        new B();
        System.out.println(Cat.n1);
    }
}

class Cat{
    public static int n1 = 9;
    static {
        System.out.println("静态代码块cat加载了");
    }
}

class B extends C{
    static {
        System.out.println("静态代码块B加载了");
    }
}


class C {
    static {
        System.out.println("静态代码块C加载了");
    }
}
