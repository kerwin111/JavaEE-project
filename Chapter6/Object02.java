package Chapter6;


public class Object02 {
    public static void main(String[] args) {
        Per p1 = new Per();
        p1.name = "小明";
        p1.age = 20;
        Per p2 = p1;
        p1.age = 90;
        System.out.println(p2.age);


    }
}

class Per{
    String name;
    int age;
}
