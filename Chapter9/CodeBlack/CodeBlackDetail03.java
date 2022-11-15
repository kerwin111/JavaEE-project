package Chapter9.CodeBlack;

public class CodeBlackDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}

class AAA{
    {
        System.out.println("AAA 普通代码块被调用");
    }
    public AAA(){
        System.out.println("AAA 构造器被调用");
    }
}

class BBB extends AAA{
    public BBB(){
        System.out.println("BBB 构造器被调用");
    }
    {
        System.out.println("BBB的普通代码块被调用");
    }


}
