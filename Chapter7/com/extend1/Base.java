package Chapter7.com.extend1;

public class Base { //父类
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public Base(){
        System.out.println("父类的Base()方法");
    }
    public Base(String name){
        System.out.println("父类的Base(String name)方法");
    }
    public Base(String name,int age){
        System.out.println("父类的Base(String name,int age)方法");
    }

    public int getN4(){
        return n4;
    }

    public void text100(){
        System.out.println("text100方法");
    }

    protected void text200(){
        System.out.println("text200方法");
    }

    void text300(){
        System.out.println("text300方法");
    }
    private void text400(){
        System.out.println("text400方法");
    }
    public void callText400(){
        text400();
    }


}
