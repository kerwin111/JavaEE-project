package Chapter7.com.extend1;

public class Sub extends Base { //子类
//    public Sub(){
//        super("smith",20);
//        System.out.println("子类的Sub()方法");
//    }
    public Sub(String name,int age){
        super("king",20);
        System.out.println("子类的Sub(String name,int age)方法");
    }

    public void sayOk(){
        System.out.println(n1+","+n2+","+n3);
        text100();
        text200();
        text300();
        System.out.println(getN4());
        callText400();
    }
}
