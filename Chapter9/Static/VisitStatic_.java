package Chapter9.Static;

public class VisitStatic_ {
    public static void main(String[] args) {
        System.out.println(A.name);

        A a = new A();
        System.out.println(a.name);
    }

}

class A{
    public static String name = "Messi";
}
