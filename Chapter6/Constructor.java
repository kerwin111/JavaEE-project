package Chapter6;


// 构造器
public class Constructor {
    public static void main(String[] args) {
        Person per = new Person("switch",80);
        System.out.println("con的年龄为:"+per.age);
        System.out.println("con的姓名为"+per.name);

    }
}
class Person{
    String name;
    int age;

    public Person(String Pname,int Page){
        name = Pname;
        age = Page;
        System.out.println("构造器完成了初始化");
    }
}


