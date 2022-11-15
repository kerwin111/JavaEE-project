package Chapter9.Static;

public class StaticMethod {
    public static void main(String[] args) {
        Stu stu = new Stu("messi");
        stu.payFree(100);

        Stu stu1 = new Stu("Neymar");
        stu1.payFree(200);

        System.out.print("两人一共缴费:");
        Stu.showFree();
    }

}


class Stu{
    private String name;

    public static double free=0;

    public Stu(String name) {
        this.name = name;
    }

    public static void payFree(double free){
        Stu.free += free;
    }

    public static void showFree(){
        System.out.println(Stu.free);
    }
}