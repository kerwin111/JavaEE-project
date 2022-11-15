package Chapter6;


// This
public class ThisMethod {
    public static void main(String[] args) {
        TM t1 = new TM();
        t1.f1();
    }
}

class TM{

    String name = "Jack";
    int age = 20;

    public TM(){
        this("Jack",20);
        System.out.println("TM()构造器");
    }

    public TM(String name,int age){
        System.out.println("TM(String name,int age 构造器");
    }

    public void f1(){
        String name = "tom";
        int age = 100;
        System.out.println("name:"+name+","+"age:"+age);
        System.out.println("name:"+this.name+","+"age:"+this.age);

    }
}


