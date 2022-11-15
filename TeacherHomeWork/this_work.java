package TeacherHomeWork;

public class this_work {
    public static void main(String[] args) {
    Read read = new Read("jck",20);
    read.f1();
    }
}

class Read{
    String name;
    int age;

    public Read() {
        System.out.println("我是无参构造器");
    }

    public Read(String name, int age) {
        this();
        this.name = name;
        this.age = age;

        System.out.println("我是有参构造器调用了无参构造方法");
    }

    public void f1(){
        System.out.println("name:"+this.name+","+"age:"+this.age);
    }
}
