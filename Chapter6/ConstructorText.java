package Chapter6;


// 构造器
public class ConstructorText {
    public static void main(String[] args) {
        Person1 p1 = new Person1("switch",80);
        System.out.println("p1的年龄为:"+p1.age);
        System.out.println("p1的姓名为"+p1.name);

        Person1 p2 = new Person1();
        System.out.println("p2的年龄为:"+p2.age);
        System.out.println("p2的姓名为"+p2.name);

    }
}

class Person1{
    String name;
    int age;

    public Person1(){
        age = 18;
    }

    public Person1(String Pname,int Page){
        name = Pname;
        age = Page;
//        System.out.println("构造器完成了初始化");
    }
}


