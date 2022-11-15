package Chapter6;


public class copyPerson01 {
    public static void main(String[] args) {
        Tool t1 = new Tool();
        t1.name = "milan";
        t1.age = 10;

        MyTools m1 = new MyTools();
        Tool t2 =m1.copyPerson(t1);
        System.out.println("t1的年龄是:"+t1.age+"\t"+"t1的名字是:"+t1.name);
        System.out.println("t2的年龄是:"+t2.age+"\t"+"t2的名字是:"+t2.name);
        System.out.println(t1 == t2);
    }
}

class Tool{
    String name;
    int age;
}
class MyTools{
    public Tool copyPerson(Tool t){
     Tool t2 = new Tool();
     t2.age = t.age;
     t2.name = t.name;
     return t2;
    }
}
