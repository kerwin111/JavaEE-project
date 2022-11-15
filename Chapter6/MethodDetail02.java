package Chapter6;


public class MethodDetail02 {
    public static void main(String[] args) {
        A a = new A();
        a.say();
    }
}

class A{
    public void say(){
        sayHi();
        System.out.println("这里输出say");
    }
    public void sayHi(){
        System.out.println("这里输出sayHi");
        B b = new B();
        b.hello();
    }
}
class B{
    public void hello(){
        System.out.println("这里输出hello");
    }
}
