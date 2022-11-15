package Chapter7.com.HomeWork.HomeWork03_;

public class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("这就是教授");
        super.introduce();
    }
}
